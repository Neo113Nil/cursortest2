package com.payair.hce;

/* loaded from: classes4.dex */
class onContextItemSelected implements com.payair.hce.getApplicationContext {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static com.payair.hce.isNetworkError getCvrMaskAnd;
    private static char[] getPaymentFci;
    private static final java.lang.Object getProfileVersion;
    private final com.payair.hce.gotPostData AlternateContactlessPaymentDataJson;
    private final java.lang.String DigitizedCardProfile;
    private com.payair.hce.ContactlessPaymentData IccPrivateKeyCrtComponentsJson;
    private final com.payair.hce.getOpPackageName RecordsJson;
    private final boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private final com.payair.hce.VisaRepersoInitializer getAid;
    private com.payair.hce.checkPermission getGpoResponse;
    private final com.payair.hce.getApplicationInfo valueOf;
    private final com.payair.hce.checkForSuccess values;
    private final com.payair.hce.accessgetCoroutineScopep writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, short s, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (b * 2) + 4;
        int i4 = (i * 2) + 107;
        int i5 = s * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i4 += -i3;
            i3 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i3;
            i3 = bArr[i3];
            i7 = i8;
            i4 += -i3;
            i3 = i6 + 1;
            i2 = i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * 46) + (i2 * 46) + (((~(i4 | i5)) | i) * (-90)) + (((~(i2 | i)) | (~(i4 | i3))) * (-45)) + (((~((~i) | i3)) | i4 | (~(i | i5))) * 45);
        if (i6 == 1) {
            return writeReplace(objArr);
        }
        if (i6 == 2) {
            return values(objArr);
        }
        if (i6 != 3) {
            return i6 != 4 ? DigitizedCardProfile(objArr) : valueOf(objArr);
        }
        com.payair.hce.onContextItemSelected oncontextitemselected = (com.payair.hce.onContextItemSelected) objArr[0];
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 73) % 128;
        java.lang.String AlternateContactlessPaymentDataJson = com.payair.hce.stopService.AlternateContactlessPaymentDataJson(oncontextitemselected.values());
        return AlternateContactlessPaymentDataJson.substring(AlternateContactlessPaymentDataJson.length() - 4);
    }

    static /* synthetic */ com.payair.hce.isNetworkError AlternateContactlessPaymentDataJson(com.payair.hce.isNetworkError isnetworkerror) {
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i + 99;
        getCiacDecline = i2 % 128;
        getCvrMaskAnd = isnetworkerror;
        if (i2 % 2 != 0) {
            throw null;
        }
        getCiacDecline = (i + 49) % 128;
        return isnetworkerror;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        getCardLayoutDescription();
        getProfileVersion = new java.lang.Object();
        int i = SdkCoreBusinessLogicModuleImpl + 45;
        getCiacDecline = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    onContextItemSelected(java.lang.String str, com.payair.hce.gotPostData gotpostdata, com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep, com.payair.hce.checkForSuccess checkforsuccess, com.payair.hce.sendUpdateRNSInformation sendupdaternsinformation, com.payair.hce.VisaRepersoInitializer visaRepersoInitializer, boolean z, com.payair.hce.getApplicationInfo getapplicationinfo, com.payair.hce.getPackageName getpackagename, com.payair.hce.useDemoMode usedemomode, com.payair.hce.setUpMCBP setupmcbp, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2, com.payair.hce.getErrors geterrors, com.payair.hce.getOpPackageName getoppackagename, com.payair.hce.obtainStyledAttributes obtainstyledattributes, boolean z2) {
        this.IccPrivateKeyCrtComponentsJson = null;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{0, 6, 16, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001", true, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onContextItemSelected.class.getName());
        this.getGpoResponse = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.DigitizedCardProfile = str;
        this.values = checkforsuccess;
        this.writeReplace = accessgetcoroutinescopep;
        this.AlternateContactlessPaymentDataJson = gotpostdata;
        this.getAid = visaRepersoInitializer;
        this.SdkCoreAlternateContactlessPaymentDataImpl = z;
        this.valueOf = getapplicationinfo;
        this.RecordsJson = getoppackagename;
        com.payair.hce.getColorStateList getcolorstatelist = new com.payair.hce.getColorStateList(this, sendupdaternsinformation, geterrors, obtainstyledattributes);
        try {
            this.IccPrivateKeyCrtComponentsJson = new com.payair.hce.ContactlessPaymentData(new com.payair.hce.onLowMemory(checkforsuccess, getoppackagename, z2), new com.payair.hce.onDestroy(sendupdaternsinformation, getcolorstatelist, checkforsuccess.getContactlessPaymentData() != null ? checkforsuccess.getContactlessPaymentData().getIccPrivateKeyCrtComponents() : null), getcolorstatelist, setupmcbp, new com.payair.hce.onTimeout(getpackagename, this), new com.payair.hce.getContentResolver(this, getapplicationinfo), usedemomode, valueOf(list), (java.util.List) valueOf(new java.lang.Object[]{this, list2}, -1942070843, 1942070844, java.lang.System.identityHashCode(this)), new com.payair.hce.unregisterComponentCallbacks());
        } catch (com.payair.hce.removeCardManagerListener unused) {
            this.IccPrivateKeyCrtComponentsJson = null;
        }
    }

    private static void a(int[] iArr, java.lang.String str, boolean z, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        char c;
        int length;
        char[] cArr2;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = getPaymentFci;
        if (cArr3 != null) {
            int i8 = $10 + 91;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr3[i2]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2807, (char) ((android.os.Process.getThreadPriority(i3) + 20) >> 6));
                        byte b = (byte) ($$b & 5);
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i2] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i2++;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i5];
        java.lang.System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr2 != null) {
            int i9 = $10 + 67;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr = new char[i5];
                c = 0;
                getaccounttype.writeReplace = 0;
            } else {
                cArr = new char[i5];
                getaccounttype.writeReplace = 0;
                c = 0;
            }
            while (getaccounttype.writeReplace < i5) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i10 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 44, android.view.KeyEvent.normalizeMetaState(0) + 2836, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(0, (byte) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr[i10] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2879 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b3 = (byte) ($$b & 6);
                        byte b4 = (byte) (b3 - 2);
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr[i11] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                $11 = ($10 + 117) % 128;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            $10 = ($11 + 73) % 128;
            char[] cArr5 = new char[i5];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i12 = i5 - i7;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i12, i7);
            java.lang.System.arraycopy(cArr5, i7, cArr4, 0, i12);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr6[getaccounttype.writeReplace] = cArr4[(i5 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            $11 = ($10 + 41) % 128;
            int i13 = 0;
            while (true) {
                getaccounttype.writeReplace = i13;
                if (getaccounttype.writeReplace >= i5) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i13 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onContextItemSelected oncontextitemselected = (com.payair.hce.onContextItemSelected) objArr[0];
        java.util.List list = (java.util.List) objArr[1];
        if (((com.payair.hce.getStatusCodeFromServer) valueOf(new java.lang.Object[]{oncontextitemselected}, -415876941, 415876943, java.lang.System.identityHashCode(oncontextitemselected))) != com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{6, 4, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 0}, "\u0000\u0001\u0001\u0000", false, objArr2);
            arrayList.add(new com.payair.hce.startDeviceAuthenticationForRegistration(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern()).valueOf(), (byte) 3));
            if (list != null) {
                getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 107) % 128;
                if (!list.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 17) % 128;
                        if (list.contains(it.next())) {
                            it.remove();
                            int i = SdkCoreBusinessLogicModuleImpl + 13;
                            getCiacDecline = i % 128;
                            if (i % 2 != 0) {
                                int i2 = 5 / 4;
                            }
                        }
                    }
                    arrayList.addAll(list);
                }
            }
            return arrayList;
        }
        int i3 = getCiacDecline + 9;
        int i4 = i3 % 128;
        SdkCoreBusinessLogicModuleImpl = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        getCiacDecline = (i4 + 83) % 128;
        return list;
    }

    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> valueOf(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        if (((com.payair.hce.getStatusCodeFromServer) valueOf(new java.lang.Object[]{this}, -415876941, 415876943, java.lang.System.identityHashCode(this))) == com.payair.hce.getStatusCodeFromServer.DigitizedCardProfile) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 1) % 128;
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{10, 4, 0, 2}, "\u0001\u0001\u0001\u0001", false, objArr);
        arrayList.add(new com.payair.hce.startDeviceAuthenticationForRegistration(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern()).valueOf(), (byte) 8));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{14, 4, 143, 3}, null, true, objArr2);
        arrayList.add(new com.payair.hce.startDeviceAuthenticationForRegistration(com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern()).valueOf(), (byte) 1));
        if (list != null) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 45) % 128;
            if (!list.isEmpty()) {
                getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 57) % 128;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i = SdkCoreBusinessLogicModuleImpl + 15;
                    getCiacDecline = i % 128;
                    if (i % 2 != 0) {
                        list.contains(it.next());
                        throw new java.lang.ArithmeticException();
                    }
                    if (list.contains(it.next())) {
                        it.remove();
                    }
                }
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // com.payair.hce.sendRequest
    public final com.payair.hce.component1 valueOf() {
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 119) % 128;
        com.payair.hce.component1 DigitizedCardProfile = com.payair.hce.component1.DigitizedCardProfile(this.writeReplace.values(AlternateContactlessPaymentDataJson()));
        int i = getCiacDecline + 109;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    @Override // com.payair.hce.sendRequest
    public final java.lang.String AlternateContactlessPaymentDataJson() {
        int i = getCiacDecline;
        SdkCoreBusinessLogicModuleImpl = (i + 65) % 128;
        java.lang.String str = this.DigitizedCardProfile;
        int i2 = i + 67;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.payair.hce.sendRequest
    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        java.util.List<java.lang.String> RecordsJson = this.writeReplace.RecordsJson(AlternateContactlessPaymentDataJson());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : RecordsJson) {
            final java.lang.String AlternateContactlessPaymentDataJson = this.writeReplace.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson(), str);
            try {
                final int values = this.writeReplace.values(AlternateContactlessPaymentDataJson(), str);
                if (values != com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.DigitizedCardProfile.DigitizedCardProfile()) {
                    int i = getCiacDecline + 49;
                    SdkCoreBusinessLogicModuleImpl = i % 128;
                    if (i % 2 == 0) {
                        this.writeReplace.DigitizedCardProfile(AlternateContactlessPaymentDataJson(), str);
                        throw new java.lang.ArithmeticException();
                    }
                    byte[] DigitizedCardProfile = this.writeReplace.DigitizedCardProfile(AlternateContactlessPaymentDataJson(), str);
                    if (DigitizedCardProfile != null) {
                        final com.payair.hce.isNetworkError writeReplace = com.payair.hce.getAssets.writeReplace(DigitizedCardProfile);
                        arrayList.add(new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus() { // from class: com.payair.hce.onContextItemSelected.2
                            private static final byte[] $$a = null;
                            private static final int $$b = 0;
                            private static final byte[] $$d = null;
                            private static final int $$e = 0;
                            private static int $10;
                            private static int $11;
                            private static int IccPrivateKeyCrtComponentsJson;
                            private static int RecordsJson;
                            private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
                            private static int SdkCoreBusinessLogicModuleImpl;
                            private static char[] getAid;
                            private static boolean getProfileVersion;
                            private static long writeReplace;

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private static void c(short s, short s2, int i2, java.lang.Object[] objArr) {
                                int i3;
                                int i4;
                                byte[] bArr = $$a;
                                int i5 = 39 - (s2 * 2);
                                int i6 = i2 + 65;
                                char[] cArr = new char[s + 1];
                                int i7 = -1;
                                if (bArr == null) {
                                    int i8 = -1;
                                    int i9 = i5;
                                    i5 = (i5 + i6) - 2;
                                    i3 = i9;
                                    i7 = i8;
                                    i4 = i7 + 1;
                                    cArr[i4] = (char) i5;
                                    if (i4 == s) {
                                        objArr[0] = new java.lang.String(cArr);
                                        return;
                                    }
                                    int i10 = i3 + 1;
                                    i9 = i10;
                                    i6 = bArr[i10];
                                    i8 = i4;
                                    i5 = (i5 + i6) - 2;
                                    i3 = i9;
                                    i7 = i8;
                                    i4 = i7 + 1;
                                    cArr[i4] = (char) i5;
                                    if (i4 == s) {
                                    }
                                } else {
                                    i3 = i5;
                                    i5 = i6;
                                    i4 = i7 + 1;
                                    cArr[i4] = (char) i5;
                                    if (i4 == s) {
                                    }
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0026). Please report as a decompilation issue!!! */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            private static void d(short s, int i2, short s2, java.lang.Object[] objArr) {
                                int i3;
                                int i4;
                                int i5 = (i2 * 4) + 1;
                                int i6 = s2 + 112;
                                byte[] bArr = $$d;
                                int i7 = 4 - (s * 4);
                                byte[] bArr2 = new byte[i5];
                                if (bArr == null) {
                                    int i8 = i5;
                                    i4 = 0;
                                    i6 += -i8;
                                    i7++;
                                    i3 = i4;
                                    i4 = i3 + 1;
                                    bArr2[i3] = (byte) i6;
                                    if (i4 == i5) {
                                        objArr[0] = new java.lang.String(bArr2, 0);
                                        return;
                                    }
                                    i8 = bArr[i7];
                                    i6 += -i8;
                                    i7++;
                                    i3 = i4;
                                    i4 = i3 + 1;
                                    bArr2[i3] = (byte) i6;
                                    if (i4 == i5) {
                                    }
                                } else {
                                    i3 = 0;
                                    i4 = i3 + 1;
                                    bArr2[i3] = (byte) i6;
                                    if (i4 == i5) {
                                    }
                                }
                            }

                            private static void b(java.lang.String str2, int i2, java.lang.Object[] objArr) {
                                char[] charArray = str2 != null ? str2.toCharArray() : str2;
                                com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
                                getdsrpdata.values = i2;
                                int length = charArray.length;
                                long[] jArr = new long[length];
                                getdsrpdata.valueOf = 0;
                                while (getdsrpdata.valueOf < charArray.length) {
                                    int i3 = $10 + 125;
                                    $11 = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i4 = getdsrpdata.valueOf;
                                        try {
                                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                                            if (obj == null) {
                                                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 31, android.graphics.Color.red(0) + 1890, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3599));
                                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                d((short) 0, 0, (short) 1, objArr3);
                                                obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                                            }
                                            jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() / (writeReplace * (-4761752123935132024L));
                                            java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                                            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                            if (obj2 == null) {
                                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 64, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1444, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29681));
                                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                d((short) 0, 0, (short) 0, objArr5);
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
                                    } else {
                                        int i5 = getdsrpdata.valueOf;
                                        java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                                        if (obj3 == null) {
                                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 31, 1890 - android.graphics.Color.argb(0, 0, 0, 0), (char) (3600 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            d((short) 0, 0, (short) 1, objArr7);
                                            obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj3);
                                        }
                                        jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).longValue() ^ (writeReplace ^ (-4761752123935132024L));
                                        java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                        if (obj4 == null) {
                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.KeyEvent.keyCodeFromString(""), 1443 - android.view.View.MeasureSpec.getSize(0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29681));
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            d((short) 0, 0, (short) 0, objArr9);
                                            obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
                                    }
                                }
                                char[] cArr = new char[length];
                                getdsrpdata.valueOf = 0;
                                while (getdsrpdata.valueOf < charArray.length) {
                                    $10 = ($11 + 39) % 128;
                                    cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                                    java.lang.Object[] objArr10 = {getdsrpdata, getdsrpdata};
                                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                                    if (obj5 == null) {
                                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(65 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1443 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 29683));
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        d((short) 0, 0, (short) 0, objArr11);
                                        obj5 = cls5.getMethod((java.lang.String) objArr11[0], java.lang.Object.class, java.lang.Object.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj5);
                                    }
                                    ((java.lang.reflect.Method) obj5).invoke(null, objArr10);
                                }
                                objArr[0] = new java.lang.String(cArr);
                            }

                            private static void a(int[] iArr, java.lang.String str2, int i2, java.lang.String str3, java.lang.Object[] objArr) {
                                char[] cArr;
                                java.lang.String str4 = str3;
                                byte[] bArr = str4;
                                if (str4 != null) {
                                    bArr = str4.getBytes("ISO-8859-1");
                                }
                                byte[] bArr2 = bArr;
                                if (str2 != null) {
                                    $11 = ($10 + 21) % 128;
                                    cArr = str2.toCharArray();
                                } else {
                                    cArr = str2;
                                }
                                char[] cArr2 = cArr;
                                com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
                                char[] cArr3 = getAid;
                                long j = 0;
                                int i3 = 1;
                                if (cArr3 != null) {
                                    int length = cArr3.length;
                                    char[] cArr4 = new char[length];
                                    int i4 = 0;
                                    while (i4 < length) {
                                        try {
                                            java.lang.Object[] objArr2 = new java.lang.Object[i3];
                                            objArr2[0] = java.lang.Integer.valueOf(cArr3[i4]);
                                            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                                            if (obj == null) {
                                                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.text.TextUtils.indexOf("", "", 0, 0), 286 - android.widget.ExpandableListView.getPackedPositionGroup(j), (char) (46337 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                                            }
                                            cArr4[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                                            i4++;
                                            $11 = ($10 + 73) % 128;
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
                                    cArr3 = cArr4;
                                }
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 45, 286 - android.graphics.Color.blue(0), (char) (46337 - (android.os.Process.myPid() >> 22)))).getMethod("x", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                                if (getProfileVersion) {
                                    getumdgeneration.values = bArr2.length;
                                    char[] cArr5 = new char[getumdgeneration.values];
                                    getumdgeneration.valueOf = 0;
                                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                                        cArr5[getumdgeneration.valueOf] = (char) (cArr3[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i2] - intValue);
                                        java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                                        if (obj3 == null) {
                                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.getOffsetAfter("", 0), 1629 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.os.Process.getGidForName("") + 1));
                                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                                            d((short) 0, 0, (short) 6, objArr5);
                                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                                        }
                                        ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
                                    }
                                    objArr[0] = new java.lang.String(cArr5);
                                    return;
                                }
                                if (!SdkCoreAlternateContactlessPaymentDataImpl) {
                                    getumdgeneration.values = iArr.length;
                                    char[] cArr6 = new char[getumdgeneration.values];
                                    getumdgeneration.valueOf = 0;
                                    while (getumdgeneration.valueOf < getumdgeneration.values) {
                                        cArr6[getumdgeneration.valueOf] = (char) (cArr3[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i2] - intValue);
                                        getumdgeneration.valueOf++;
                                    }
                                    objArr[0] = new java.lang.String(cArr6);
                                    return;
                                }
                                getumdgeneration.values = cArr2.length;
                                char[] cArr7 = new char[getumdgeneration.values];
                                getumdgeneration.valueOf = 0;
                                $11 = ($10 + 43) % 128;
                                while (getumdgeneration.valueOf < getumdgeneration.values) {
                                    int i5 = $11 + 15;
                                    $10 = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values % 1) + getumdgeneration.valueOf] << i2] >> intValue);
                                        java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                                        if (obj4 == null) {
                                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43, android.graphics.Color.rgb(0, 0, 0) + 16778845, (char) ((-1) - android.view.MotionEvent.axisFromString("")));
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            d((short) 0, 0, (short) 6, objArr7);
                                            obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                                        }
                                        ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                                    } else {
                                        cArr7[getumdgeneration.valueOf] = (char) (cArr3[cArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i2] - intValue);
                                        java.lang.Object[] objArr8 = {getumdgeneration, getumdgeneration};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                                        if (obj5 == null) {
                                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.text.TextUtils.indexOf("", "", 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1629, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            d((short) 0, 0, (short) 6, objArr9);
                                            obj5 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                                        }
                                        ((java.lang.reflect.Method) obj5).invoke(null, objArr8);
                                    }
                                }
                                objArr[0] = new java.lang.String(cArr7);
                            }

                            @Override // com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus
                            public final java.lang.String getStatus() {
                                int i2 = RecordsJson + 5;
                                SdkCoreBusinessLogicModuleImpl = i2 % 128;
                                com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace valueOf2 = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(values);
                                if (i2 % 2 != 0) {
                                    return valueOf2.toString();
                                }
                                throw null;
                            }

                            @Override // com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus
                            public final int getAtc() {
                                SdkCoreBusinessLogicModuleImpl = (RecordsJson + 71) % 128;
                                int profileVersion = writeReplace.getProfileVersion();
                                int i2 = RecordsJson + 75;
                                SdkCoreBusinessLogicModuleImpl = i2 % 128;
                                if (i2 % 2 != 0) {
                                    return profileVersion;
                                }
                                throw null;
                            }

                            @Override // com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus
                            public final java.lang.String getTimestamp() {
                                if (!getStatus().equals(com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf.toString())) {
                                    int i2 = SdkCoreBusinessLogicModuleImpl + 39;
                                    RecordsJson = i2 % 128;
                                    if (i2 % 2 == 0) {
                                        java.lang.String str2 = AlternateContactlessPaymentDataJson;
                                        if (str2 != null) {
                                            return str2;
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                                java.lang.String DigitizedCardProfile2 = com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis()));
                                int i3 = SdkCoreBusinessLogicModuleImpl + 7;
                                RecordsJson = i3 % 128;
                                if (i3 % 2 == 0) {
                                    return DigitizedCardProfile2;
                                }
                                throw null;
                            }

                            static {
                                init$1();
                                $10 = 0;
                                $11 = 1;
                                init$0();
                                RecordsJson = 0;
                                SdkCoreBusinessLogicModuleImpl = 1;
                                writeReplace = 8544434994574326611L;
                                getAid = new char[]{10779, 10958, 10957, 10974, 10959, 10971, 10969, 10776, 10947, 10956, 10962, 10968, 10972, 10949, 10960, 10944, 10975, 10955, 10945, 10991, 10989, 10970, 10950, 10981, 10990, 10948, 11006, 10946, 10788, 10993, 10976, 10777, 10770, 10951, 10772, 11002, 10965, 11001, 11000};
                                IccPrivateKeyCrtComponentsJson = -143185366;
                                SdkCoreAlternateContactlessPaymentDataImpl = true;
                                getProfileVersion = true;
                            }

                            static void init$1() {
                                $$d = new byte[]{37, 88, 64, 59};
                                $$e = 238;
                            }

                            static void init$0() {
                                $$a = new byte[]{47, com.google.common.base.Ascii.SYN, -53, 34, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10, 39, 0, 4, 13, -9, 19, -19, 1, -31, 32, 19, -12, -18, 36, -1, -7, 5, 5, -5};
                                $$b = 2;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:123:0x17c1 A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:124:0x17c2  */
                            /* JADX WARN: Removed duplicated region for block: B:170:0x1c4c A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:526:0x1669 A[Catch: Exception -> 0x16a3, all -> 0x16c2, IOException -> 0x16ce, TryCatch #20 {all -> 0x16c2, blocks: (B:367:0x1361, B:370:0x1364, B:372:0x13fa, B:374:0x1419, B:376:0x143b, B:378:0x145c, B:380:0x147e, B:382:0x149c, B:405:0x16a3, B:406:0x16c1, B:436:0x1604, B:437:0x1607, B:500:0x161d, B:502:0x162c, B:503:0x162d, B:506:0x164b, B:508:0x1652, B:509:0x1653, B:524:0x1663, B:526:0x1669, B:527:0x166a, B:550:0x167c, B:552:0x1682, B:553:0x1683), top: B:366:0x1361 }] */
                            /* JADX WARN: Removed duplicated region for block: B:527:0x166a A[Catch: Exception -> 0x16a3, all -> 0x16c2, IOException -> 0x16ce, TryCatch #20 {all -> 0x16c2, blocks: (B:367:0x1361, B:370:0x1364, B:372:0x13fa, B:374:0x1419, B:376:0x143b, B:378:0x145c, B:380:0x147e, B:382:0x149c, B:405:0x16a3, B:406:0x16c1, B:436:0x1604, B:437:0x1607, B:500:0x161d, B:502:0x162c, B:503:0x162d, B:506:0x164b, B:508:0x1652, B:509:0x1653, B:524:0x1663, B:526:0x1669, B:527:0x166a, B:550:0x167c, B:552:0x1682, B:553:0x1683), top: B:366:0x1361 }] */
                            /* JADX WARN: Removed duplicated region for block: B:552:0x1682 A[Catch: Exception -> 0x16a3, all -> 0x16c2, IOException -> 0x16ce, TryCatch #20 {all -> 0x16c2, blocks: (B:367:0x1361, B:370:0x1364, B:372:0x13fa, B:374:0x1419, B:376:0x143b, B:378:0x145c, B:380:0x147e, B:382:0x149c, B:405:0x16a3, B:406:0x16c1, B:436:0x1604, B:437:0x1607, B:500:0x161d, B:502:0x162c, B:503:0x162d, B:506:0x164b, B:508:0x1652, B:509:0x1653, B:524:0x1663, B:526:0x1669, B:527:0x166a, B:550:0x167c, B:552:0x1682, B:553:0x1683), top: B:366:0x1361 }] */
                            /* JADX WARN: Removed duplicated region for block: B:553:0x1683 A[Catch: Exception -> 0x16a3, all -> 0x16c2, IOException -> 0x16ce, TRY_LEAVE, TryCatch #20 {all -> 0x16c2, blocks: (B:367:0x1361, B:370:0x1364, B:372:0x13fa, B:374:0x1419, B:376:0x143b, B:378:0x145c, B:380:0x147e, B:382:0x149c, B:405:0x16a3, B:406:0x16c1, B:436:0x1604, B:437:0x1607, B:500:0x161d, B:502:0x162c, B:503:0x162d, B:506:0x164b, B:508:0x1652, B:509:0x1653, B:524:0x1663, B:526:0x1669, B:527:0x166a, B:550:0x167c, B:552:0x1682, B:553:0x1683), top: B:366:0x1361 }] */
                            /* JADX WARN: Type inference failed for: r12v92, types: [java.lang.reflect.Field] */
                            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Integer, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r15v62 */
                            /* JADX WARN: Type inference failed for: r15v93 */
                            /* JADX WARN: Type inference failed for: r15v94 */
                            /* JADX WARN: Type inference failed for: r15v95 */
                            /* JADX WARN: Type inference failed for: r1v556, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r1v586, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r2v203 */
                            /* JADX WARN: Type inference failed for: r2v235, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r2v248 */
                            /* JADX WARN: Type inference failed for: r2v321 */
                            /* JADX WARN: Type inference failed for: r2v322 */
                            /* JADX WARN: Type inference failed for: r2v78 */
                            /* JADX WARN: Type inference failed for: r2v83 */
                            /* JADX WARN: Type inference failed for: r2v84 */
                            /* JADX WARN: Type inference failed for: r30v11 */
                            /* JADX WARN: Type inference failed for: r30v13 */
                            /* JADX WARN: Type inference failed for: r30v14 */
                            /* JADX WARN: Type inference failed for: r30v15 */
                            /* JADX WARN: Type inference failed for: r30v2 */
                            /* JADX WARN: Type inference failed for: r30v21 */
                            /* JADX WARN: Type inference failed for: r30v22 */
                            /* JADX WARN: Type inference failed for: r30v3 */
                            /* JADX WARN: Type inference failed for: r30v4 */
                            /* JADX WARN: Type inference failed for: r30v5 */
                            /* JADX WARN: Type inference failed for: r30v6 */
                            /* JADX WARN: Type inference failed for: r30v7 */
                            /* JADX WARN: Type inference failed for: r30v8 */
                            /* JADX WARN: Type inference failed for: r30v9 */
                            /* JADX WARN: Type inference failed for: r37v19 */
                            /* JADX WARN: Type inference failed for: r37v2 */
                            /* JADX WARN: Type inference failed for: r37v23, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r37v24 */
                            /* JADX WARN: Type inference failed for: r37v25 */
                            /* JADX WARN: Type inference failed for: r38v21 */
                            /* JADX WARN: Type inference failed for: r38v3 */
                            /* JADX WARN: Type inference failed for: r38v31 */
                            /* JADX WARN: Type inference failed for: r38v32 */
                            /* JADX WARN: Type inference failed for: r38v4 */
                            /* JADX WARN: Type inference failed for: r38v43 */
                            /* JADX WARN: Type inference failed for: r38v44 */
                            /* JADX WARN: Type inference failed for: r38v45 */
                            /* JADX WARN: Type inference failed for: r38v5 */
                            /* JADX WARN: Type inference failed for: r38v6 */
                            /* JADX WARN: Type inference failed for: r38v7 */
                            /* JADX WARN: Type inference failed for: r38v8 */
                            /* JADX WARN: Type inference failed for: r3v326, types: [java.lang.reflect.Field] */
                            /* JADX WARN: Type inference failed for: r3v360, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r3v467, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r4v330, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r4v379, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r4v470, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r4v501, types: [java.util.Map] */
                            /* JADX WARN: Type inference failed for: r6v39 */
                            /* JADX WARN: Type inference failed for: r6v40 */
                            /* JADX WARN: Type inference failed for: r6v45, types: [java.lang.Class] */
                            /* JADX WARN: Type inference failed for: r6v46 */
                            /* JADX WARN: Type inference failed for: r6v47 */
                            /* JADX WARN: Type inference failed for: r6v57 */
                            /* JADX WARN: Type inference failed for: r6v81 */
                            /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.reflect.Field] */
                            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public static java.lang.Object[] writeReplace(android.content.Context context, int i2, int i3, int i4) {
                                java.lang.Integer num;
                                java.lang.Integer num2;
                                int i5;
                                java.lang.String str2;
                                char c;
                                java.lang.Object[] objArr;
                                int i6;
                                java.lang.Object[] objArr2;
                                int i7;
                                java.lang.Object[] objArr3;
                                int i8;
                                java.lang.Object[] objArr4;
                                int i9;
                                char c2;
                                java.lang.Object[] objArr5;
                                ?? r37;
                                java.lang.String str3;
                                int i10;
                                ?? r6;
                                java.lang.String intern;
                                java.lang.Runtime runtime;
                                java.lang.Process exec;
                                java.lang.Throwable th;
                                java.lang.Throwable cause;
                                java.lang.Object newInstance;
                                java.lang.Throwable th2;
                                java.lang.Throwable cause2;
                                java.lang.Object newInstance2;
                                java.io.DataOutputStream dataOutputStream;
                                java.lang.String str4;
                                java.lang.Throwable th3;
                                java.lang.String str5;
                                java.lang.Object obj;
                                ?? r30;
                                java.lang.String str6;
                                long j;
                                java.lang.Object[] objArr6;
                                char c3;
                                java.lang.Object[] objArr7;
                                int i11;
                                java.lang.Object[] objArr8;
                                int i12;
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                a(null, null, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, "\u0086\u0090\u008c\u0098\u008c\u0086\u008e\u0084\u0083\u0085\u008e\u0097\u0096\u0096\u0095\u0088\u0087\u0096\u0088\u0084\u008c\u0093\u0084\u008c\u0086\u0085\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr9);
                                java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                a(null, null, (android.os.Process.myPid() >> 22) + 127, "\u008d\u008e\u0099\u0083\u0084\u0083\u0082", objArr10);
                                java.lang.String intern3 = ((java.lang.String) objArr10[0]).intern();
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                a(null, null, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u0082\u0083\u0093\u008d\u009c\u009b\u0088\u0089\u008c\u0083\u0097\u0088\u0083\u008f\u0083\u009a", objArr11);
                                java.lang.String intern4 = ((java.lang.String) objArr11[0]).intern();
                                ?? r15 = -1347122530;
                                try {
                                    if (context == null) {
                                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                                        b("跴\ue113哰쮳㼔鋄Ǝ畁\ue8ea徒덫☱", 27823 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr12);
                                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[0]).intern()};
                                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj2 == null) {
                                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '\f', android.view.View.getDefaultSize(0, 0) + 3161, (char) (android.os.Process.getGidForName("") + 33100));
                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                            c(r7[41], (byte) (-$$a[52]), (short) ($$b | 33), objArr14);
                                            obj2 = cls.getMethod((java.lang.String) objArr14[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj2);
                                        }
                                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr13)).longValue();
                                        long j2 = i2;
                                        long j3 = ~j2;
                                        long j4 = ~((~longValue) | (-396564719));
                                        long j5 = (((-107) * longValue) - 21811059545L) + (((~(longValue | j3)) | (~(longValue | 396564718))) * (-108)) + (((~(396564718 | j2)) | j4 | (~((-396564719) | j3))) * 54) + ((j4 | j2) * 54) + 1304035457;
                                        int i13 = ~i2;
                                        if (((((int) (j5 >> 32)) & ((((1899383957 | i2) * (-859)) - 1518152662) + (((~(1899383957 | i13)) | (~((-1614022678) | i2))) * 859) + (((~(462157546 | i13)) | (-2076180224)) * 859))) | (((int) j5) & ((((~(974004276 | i2)) | 26219841) * (-566)) + 518301707 + ((~(1000224117 | i2)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST)))) != 0) {
                                            objArr6 = new java.lang.Object[]{new int[]{i2}, new int[]{i2 ^ 50}, null, null, new int[1]};
                                            java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((((~((-732316175) | i2)) | 25182730) | r3) * (-470)) - 18882844) + (((~(1004953214 | i13)) | (~((-707133445) | i2))) * 470))};
                                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj3 == null) {
                                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), android.view.View.combineMeasuredStates(0, 0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                c(r8[3], (byte) (-$$a[52]), r8[41], objArr16);
                                                obj3 = cls2.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj3);
                                            }
                                            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr15)).intValue();
                                            c3 = 0;
                                            ((int[]) objArr6[4])[0] = intValue;
                                        } else {
                                            objArr6 = new java.lang.Object[]{new int[]{i2}, new int[]{i2}, null, null, new int[1]};
                                            int i14 = ~((-316807524) | i2);
                                            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((274864194 | i14) * (-280)) + 1351785072 + ((i14 | (~((-713328422) | i2))) * 140) + (((~((-41943330) | i2)) | (~((-274864195) | i13)) | (~((-671385093) | i13))) * 140))};
                                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj4 == null) {
                                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2713 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                c(r4[3], (byte) (-$$a[52]), r4[41], objArr18);
                                                obj4 = cls3.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj4);
                                            }
                                            int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr17)).intValue();
                                            c3 = 0;
                                            ((int[]) objArr6[4])[0] = intValue2;
                                        }
                                        if (((int[]) objArr6[1])[c3] != i2) {
                                            return objArr6;
                                        }
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        b("跴貟迌踍襳训諼蕵萕蝄膕胩茡艵鲆龑黛餝顦骫", 311 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr19);
                                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[c3]).intern()};
                                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                        if (obj5 == null) {
                                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3161 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 33100));
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            c(r7[41], (byte) (-$$a[52]), (short) ($$b | 33), objArr21);
                                            obj5 = cls4.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj5);
                                        }
                                        long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr20)).longValue();
                                        long j6 = ~longValue2;
                                        long j7 = (~(j6 | 699286414)) | (~(j6 | j3)) | (~(699286414 | j3));
                                        long j8 = ((591 * longValue2) - 411879697846L) + (((~(longValue2 | (-699286415) | j2)) | j7) * 590) + (j7 * (-1180)) + (((~((-699286415) | j3)) | (~(longValue2 | j3))) * 590) + 208184324;
                                        int i15 = ~((-2090183779) | i13);
                                        if (((((int) (j8 >> 32)) & (((((~((-274333993) | i13)) | 1711560403) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1535774150) + (((~((-299565353) | i13)) | 1736791763) * (-440)) + (((-274333993) | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j8) & (((((((~((-652957369) | i13)) | 40522392) | (~(2090183778 | i13))) | (~((-1477748803) | i2))) * (-84)) - 1905160647) + (((~(2090183778 | i2)) | 652957368 | i15) * (-84)) + ((i15 | 1477748802) * 84)))) != 0) {
                                            objArr7 = new java.lang.Object[]{new int[]{i2}, new int[]{i2 ^ 60}, null, null, new int[1]};
                                            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~((-265287) | i13)) * (-783)) - 36741200) + (((~(921793073 | i13)) | (-108342872)) * 783))};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj6 == null) {
                                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, android.graphics.Color.alpha(0) + 2713, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                                c(r7[3], (byte) (-$$a[52]), r7[41], objArr23);
                                                obj6 = cls5.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj6);
                                            }
                                            int intValue3 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr22)).intValue();
                                            i11 = 0;
                                            ((int[]) objArr7[4])[0] = intValue3;
                                        } else {
                                            objArr7 = new java.lang.Object[]{new int[]{i2}, new int[]{i2}, null, null, new int[1]};
                                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((~((-31248563) | i13)) | 998887382) * 226) + 588891264 + (((~((-998887383) | i2)) | 973147972 | (~((-5509153) | i13))) * (-113)) + ((~((-31248563) | i2)) * 113))};
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj7 == null) {
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(""), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                c(r7[3], (byte) (-$$a[52]), r7[41], objArr25);
                                                obj7 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj7);
                                            }
                                            int intValue4 = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr24)).intValue();
                                            i11 = 0;
                                            ((int[]) objArr7[4])[0] = intValue4;
                                        }
                                        if (((int[]) objArr7[1])[i11] != i2) {
                                            return objArr7;
                                        }
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        a(null, null, 127 - android.view.View.MeasureSpec.getMode(i11), "\u0083\u0084\u0083\u0082\u0092\u0091\u0090\u008f\u0081\u0082\u008e\u0086\u008d\u0082\u008c\u0083\u0088\u008b\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0081\u0083\u0084\u0083\u0082\u0081\u0083\u0084\u0083\u0082\u0081", objArr26);
                                        java.lang.Object[] objArr27 = {((java.lang.String) objArr26[i11]).intern()};
                                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj8 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.Gravity.getAbsoluteGravity(i11, i11), 3161 - (android.os.Process.myPid() >> 22), (char) (33147 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                            byte b = (byte) $$b;
                                            byte b2 = $$a[14];
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            c(b, b2, (short) (b2 | 40), objArr28);
                                            obj8 = cls7.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj8);
                                        }
                                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).longValue();
                                        long j9 = ~longValue3;
                                        long j10 = ((-500) * longValue3) + 33498625000L + (((~(j9 | (-66997250))) | (~(longValue3 | 66997249 | j2))) * 501) + ((~(j9 | 66997249)) * 1002) + ((~(longValue3 | 66997249 | j3)) * 501) + 1062432153;
                                        if (((((int) j10) & (((((~((-1268862238) | i13)) | (~((-1588878649) | i13))) * (-867)) - 1972008908) + (((~((-1268862238) | i2)) | 1252019480 | (~((-1588878649) | i2))) * (-1734)) + (((~((-1252019481) | i13)) | (~((-16842758) | i2)) | (~((-336859169) | i2))) * 867))) | (((int) (j10 >> 32)) & ((((((~(448419524 | i13)) | (-1885645936)) * (-933)) + 1302571302) + (((~((-1885645936) | i13)) | 270533700) * 933)) - 1536250752))) != 0) {
                                            objArr8 = new java.lang.Object[]{new int[]{i2}, new int[]{i2 ^ 80}, null, null, new int[1]};
                                            java.lang.Object[] objArr29 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~((-542066757) | i13)) | (~((-488069189) | i13))) * (-867)) + 804801824 + (((~((-542066757) | i2)) | 477252 | (~((-488069189) | i2))) * (-1734)) + (((~((-477253) | i13)) | (~((-541589505) | i2)) | (~((-487591937) | i2))) * 867))};
                                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj9 == null) {
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                c(r6[3], (byte) (-$$a[52]), r6[41], objArr30);
                                                obj9 = cls8.getMethod((java.lang.String) objArr30[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj9);
                                            }
                                            int intValue5 = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr29)).intValue();
                                            i12 = 0;
                                            ((int[]) objArr8[4])[0] = intValue5;
                                        } else {
                                            objArr8 = new java.lang.Object[]{new int[]{i2}, new int[]{i2}, null, null, new int[1]};
                                            java.lang.Object[] objArr31 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((((~((-608175169) | i13)) | (~(1020518006 | i2))) * (-302)) - 1348392560) + ((~((-608175169) | i2)) * (-604)) + (((~(412342838 | i2)) | 402724900) * 302))};
                                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj10 == null) {
                                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                c(r6[3], (byte) (-$$a[52]), r6[41], objArr32);
                                                obj10 = cls9.getMethod((java.lang.String) objArr32[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj10);
                                            }
                                            int intValue6 = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr31)).intValue();
                                            i12 = 0;
                                            ((int[]) objArr8[4])[0] = intValue6;
                                        }
                                        if (((int[]) objArr8[1])[i12] != i2) {
                                            return objArr8;
                                        }
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        b("跴\uec78临꣺દ攗윕⇋莗\ue245尲븵ᣠ窭픗㜑采\uf383剋챻\u2e79裩\ueaaf䕞꜁Ǜ掄쉂㰱鸴\uf8fc媣땗ᝒ燆펞㉆걻ิ梥쪵╩", 25030 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i12, i12), objArr33);
                                        java.lang.Object[] objArr34 = {((java.lang.String) objArr33[i12]).intern()};
                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj11 == null) {
                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3162, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 33099));
                                            byte b3 = (byte) $$b;
                                            byte b4 = $$a[14];
                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                            c(b3, b4, (short) (b4 | 40), objArr35);
                                            obj11 = cls10.getMethod((java.lang.String) objArr35[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj11);
                                        }
                                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr34)).longValue();
                                        long j11 = ~longValue4;
                                        long j12 = (longValue4 * (-864)) + 56705886974L + (((~((-65480240) | j3)) | j11) * (-865)) + ((~(65480239 | j2)) * 865) + (((~(j11 | j3)) | (~(65480239 | j3))) * 865) + 929954664;
                                        int i16 = ~(1747550397 | i2);
                                        if (((((int) j12) & ((((~((-310323988) | i13)) | i16) * 1150) + 334239082 + ((i16 | (~((-1747550398) | i13))) * (-575)) + (((~((-310323988) | i2)) | (~(310323987 | i13))) * 575))) | (((int) (j12 >> 32)) & ((((~((-272413837) | i13)) | 1164812574) * (-90)) + 1687905420 + (((~((-272413837) | i2)) | (-1434301855)) * (-45)) + (((~((-1164812575) | i2)) | (-272413837) | (~(1164812574 | i13))) * 45)))) != 0) {
                                            java.lang.Object[] objArr36 = {new int[]{i2}, new int[]{i2 ^ 90}, null, null, new int[1]};
                                            java.lang.Object[] objArr37 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~(421486377 | i13)) * (-560)) - 1532660056) + ((~((-608174167) | i2)) * (-560)) + (((~(608649567 | i13)) | 421010976) * 560))};
                                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                            if (obj12 == null) {
                                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) android.text.TextUtils.getTrimmedLength(""));
                                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                c(r4[3], (byte) (-$$a[52]), r4[41], objArr38);
                                                obj12 = cls11.getMethod((java.lang.String) objArr38[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj12);
                                            }
                                            ((int[]) objArr36[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr37)).intValue();
                                            return objArr36;
                                        }
                                        java.lang.Object[] objArr39 = {new int[]{i2}, new int[]{i2}, null, null, new int[1]};
                                        java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((~((-9863201) | i13)) * 130) + 2095656384 + (((~((-9863201) | i2)) | 973086788) * 130))};
                                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                        if (obj13 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                                            c(r4[3], (byte) (-$$a[52]), r4[41], objArr41);
                                            obj13 = cls12.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj13);
                                        }
                                        ((int[]) objArr39[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr40)).intValue();
                                        return objArr39;
                                    }
                                    java.lang.Integer num3 = -604620973;
                                    int i17 = i2;
                                    java.lang.Integer num4 = 269015277;
                                    try {
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        a(null, null, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, "\u0084\u008b\u0093\u0084\u008c\u0086\u0094\u0088\u0084\u008c\u0093\u0084\u008c\u0086\u0085\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr42);
                                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                        b("趼\uf2fd猩\uf042炶\uf1f7瘢\uf76f瞤\uf4e5甋者窒ﯙ", 32579 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr43);
                                        java.lang.String str7 = (java.lang.String) cls13.getMethod(((java.lang.String) objArr43[0]).intern(), null).invoke(context, null);
                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                        a(null, null, 127 - android.view.View.MeasureSpec.getSize(0), "\u0084\u008b\u0093\u0084\u008c\u0086\u0094\u0088\u0084\u008c\u0093\u0084\u008c\u0086\u0085\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr44);
                                        java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                        a(null, null, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, "\u0086\u0090\u008c\u0098\u008c\u0086\u008e\u0084\u0083\u0085\u008e\u0097\u0096\u0096\u0095\u0084\u0093\u0089", objArr45);
                                        ?? invoke = cls14.getMethod(((java.lang.String) objArr45[0]).intern(), null).invoke(context, null);
                                        int indexOf = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke)).indexOf(str7);
                                        if (indexOf > 0) {
                                            java.lang.String str8 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(invoke);
                                            if (str8.length() >= 16) {
                                                int i18 = 0;
                                                invoke = invoke;
                                                while (i18 <= str8.length() - 16) {
                                                    java.lang.Object[] objArr46 = {str8.substring(i18, i18 + 16), 931995};
                                                    i10 = i18;
                                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj14 == null) {
                                                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777188) - android.graphics.Color.rgb(0, 0, 0), android.view.View.MeasureSpec.getSize(0) + 2594, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                                        byte b5 = $$a[41];
                                                        byte b6 = b5;
                                                        str3 = str8;
                                                        num = num4;
                                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                        c(b5, b6, (short) (b6 | 653), objArr47);
                                                        obj14 = cls15.getMethod((java.lang.String) objArr47[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                                                    } else {
                                                        num = num4;
                                                        str3 = str8;
                                                    }
                                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr46)).longValue();
                                                    long j13 = i17;
                                                    num2 = num3;
                                                    long j14 = ~j13;
                                                    r37 = invoke;
                                                    long j15 = ~((~longValue5) | j13);
                                                    j = ((-574) * longValue5) + 432680012968L + (((~(j14 | 753797931)) | j15) * 1150) + ((j15 | (~(longValue5 | j14))) * (-575)) + (((~(j13 | 753797931)) | (~(j14 | (-753797932)))) * 575);
                                                    long j16 = j + 2010898456;
                                                    int i19 = (int) (j16 >> 32);
                                                    int i20 = ~i17;
                                                    if (((((int) j16) & ((((~(648351734 | i17)) | (-2085578145)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1052337853 + (((~(648351734 | i20)) | (-2129620983)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((((~((-995242853) | i17)) | (-995767143)) * (-502)) + 517758 + ((~((-553783585) | i20)) * (-502)) + (((~((-441983559) | i17)) | (-995242853)) * 502)) & i19)) == -725904754) {
                                                        objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                                        java.lang.String str9 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(r37);
                                                        ((int[]) objArr[0])[0] = i17;
                                                        ((int[]) objArr[1])[0] = i17 ^ 20;
                                                        java.lang.Object[] objArr48 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~((-418836624) | i17)) | 1016684406) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 898699574) + (((~(i20 | (-418836624))) | 1016684406) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))};
                                                        java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r15);
                                                        if (obj15 == null) {
                                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                            c(r4[3], (byte) (-$$a[52]), r4[41], objArr49);
                                                            obj15 = cls16.getMethod((java.lang.String) objArr49[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r15, obj15);
                                                        }
                                                        ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr48)).intValue();
                                                        str6 = r15;
                                                        i5 = i17;
                                                        str2 = str6;
                                                        i6 = 1;
                                                        c = 0;
                                                        if (((int[]) objArr[i6])[c] == i5) {
                                                            return objArr;
                                                        }
                                                        int[] iArr = new int[i6];
                                                        int[] iArr2 = new int[i6];
                                                        iArr[c] = i5;
                                                        iArr2[c] = i5;
                                                        java.lang.Object[] objArr50 = {iArr, iArr2, null, null, new int[i6]};
                                                        int i21 = ~i5;
                                                        java.lang.Object[] objArr51 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((((-168824965) | i5) * (-381)) + 521806356) + (((~(835677954 | i21)) | (-978869893)) * 381)) - 102198156)};
                                                        java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                        if (obj16 == null) {
                                                            java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 2712 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                            java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                            c(r5[3], (byte) (-$$a[52]), r5[41], objArr52);
                                                            obj16 = cls17.getMethod((java.lang.String) objArr52[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj16);
                                                        }
                                                        ((int[]) objArr50[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr51)).intValue();
                                                        if (((int[]) objArr50[1])[0] != i5) {
                                                            return objArr50;
                                                        }
                                                        if ((i3 & 1) == 0) {
                                                            java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                            b("趿┱\udcb3琟⾄익绞ᙂ짌悰ᠤ뎝欖", 43151 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr53);
                                                            try {
                                                                java.lang.Object[] objArr54 = {((java.lang.String) objArr53[0]).intern()};
                                                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                                a(null, null, 127 - android.graphics.Color.green(0), "\u0084\u008b\u0093\u0084\u008c\u0086\u0094\u0088\u0084\u008c\u0093\u0084\u008c\u0086\u0085\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr55);
                                                                java.lang.Class<?> cls18 = java.lang.Class.forName(((java.lang.String) objArr55[0]).intern());
                                                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                                b("趼ｹ校헝䚾끋㴅껏ᮎ蕷\uf678挤\uecf9妩쭚㐗", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29383, objArr56);
                                                                java.lang.Object invoke2 = cls18.getMethod(((java.lang.String) objArr56[0]).intern(), java.lang.String.class).invoke(context, objArr54);
                                                                if (invoke2 != null) {
                                                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                    a(null, null, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 127, "\u008d\u0093\u0089\u0083\u008c\u0083¦¥\u0085\u008e\u0097\u0086¤\u0093\u0085\u008e\u008f\u0093\u0099\u0088\u008c\u008e\u0087\u0082\u0083\u0088\u0096\u0096\u0083\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr57);
                                                                    java.lang.Class<?> cls19 = java.lang.Class.forName(((java.lang.String) objArr57[0]).intern());
                                                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                                    b("趼왵ᨹ滻ꊔ\uf758䭰鼠폦➹硑찏6哺ꢲ", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19402, objArr58);
                                                                    java.util.List list = (java.util.List) cls19.getMethod(((java.lang.String) objArr58[0]).intern(), null).invoke(invoke2, null);
                                                                    if (list != null) {
                                                                        for (java.lang.Object obj17 : list) {
                                                                            java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                                            a(null, null, 127 - android.text.TextUtils.getTrimmedLength(""), "\u0093\u0087\u0083§\u0084\u008c\u0093\u008c\u0086\u0096\u0087\u0086\u0094\u0088\u0084\u008c\u0093\u0084\u008c\u0086\u0085\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr59);
                                                                            java.lang.Class<?> cls20 = java.lang.Class.forName(((java.lang.String) objArr59[0]).intern());
                                                                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                                            b("趼\uf2fd猩\uf042炶\uf1f7瘢\uf76f瞤\uf4e5甋者窒ﯙ", 32579 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr60);
                                                                            java.lang.String str10 = (java.lang.String) cls20.getMethod(((java.lang.String) objArr60[0]).intern(), null).invoke(obj17, null);
                                                                            java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                                            a(null, null, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "\u008d\u0093\u0089\u0083\u008c\u0083¦¥\u0085\u008e\u0097\u0086¤\u0093\u0085\u008e\u008f\u0093\u0099\u0088\u008c\u008e\u0087\u0082\u0083\u0088\u0096\u0096\u0083\u0088\u0082\u008e\u0086\u008d\u0082\u008c\u0083", objArr61);
                                                                            java.lang.Class<?> cls21 = java.lang.Class.forName(((java.lang.String) objArr61[0]).intern());
                                                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                                            b("趲幕⩱\uf65e쉀까穜䙜ቖﹱ쩎陪扢买ᩌ\ue678뉻", android.text.TextUtils.indexOf("", "") + 54269, objArr62);
                                                                            if (((java.lang.Boolean) cls21.getMethod(((java.lang.String) objArr62[0]).intern(), java.lang.String.class).invoke(invoke2, str10)).booleanValue()) {
                                                                                if (str10.length() >= 20) {
                                                                                    int i22 = 0;
                                                                                    for (int i23 = 20; i22 <= str10.length() - i23; i23 = 20) {
                                                                                        java.lang.Object[] objArr63 = {str10.substring(i22, i22 + 20), 931995};
                                                                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                                        if (obj18 == null) {
                                                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.text.TextUtils.getOffsetBefore("", 0), 2594 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                                                                                            byte b7 = $$a[41];
                                                                                            byte b8 = b7;
                                                                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                                                            c(b7, b8, (short) (b8 | 653), objArr64);
                                                                                            obj18 = cls22.getMethod((java.lang.String) objArr64[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj18);
                                                                                        }
                                                                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj18).invoke(null, objArr63)).longValue();
                                                                                        long j17 = i5;
                                                                                        long j18 = ((192 * longValue6) - 978281309) + (((~(longValue6 | j17)) | 5148850) * 191) + (((~(longValue6 | (-5148851))) | (~((~j17) | longValue6))) * 191) + 1251951674;
                                                                                        int i24 = (~((-1143638476) | i5)) | 2787787;
                                                                                        if (((((int) j18) & (((((~(1795881007 | i21)) | (-358654598)) * (-865)) - 1094718272) + ((~((-1795881008) | i5)) * 865) + (((~((-1795881008) | i21)) | (~((-358654598) | i21))) * 865))) | (((int) (j18 >> 32)) & ((i24 * 992) + 1537498186 + ((i24 | (~(1434438623 | i21))) * (-496)) + ((293587935 | i5) * 496)))) == 1245577864) {
                                                                                            objArr5 = new java.lang.Object[]{new int[]{i5}, new int[]{i5 ^ 70}, null, null, new int[1]};
                                                                                            java.lang.Object[] objArr65 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~r3) | 25206944) * (-828)) - 715794328) + ((1004929000 | i21) * (-828)) + 1142442596)};
                                                                                            java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                                            if (obj19 == null) {
                                                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.getDeadChar(0, 0), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.KeyEvent.getDeadChar(0, 0));
                                                                                                java.lang.Object[] objArr66 = new java.lang.Object[1];
                                                                                                c(r5[3], (byte) (-$$a[52]), r5[41], objArr66);
                                                                                                obj19 = cls23.getMethod((java.lang.String) objArr66[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj19);
                                                                                            }
                                                                                            c2 = 0;
                                                                                            ((int[]) objArr5[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr65)).intValue();
                                                                                            if (((int[]) objArr5[1])[c2] != i5) {
                                                                                                return objArr5;
                                                                                            }
                                                                                        } else {
                                                                                            i22++;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                java.lang.Object[] objArr67 = {new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                                                                int i25 = ~(996564991 | i5);
                                                                java.lang.Object[] objArr68 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((~((-40126908) | i21)) | 33570953 | i25) * (-502)) + 702885166 + ((i25 | (~((-6555955) | i21))) * 502))};
                                                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                if (obj20 == null) {
                                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) android.text.TextUtils.getOffsetAfter("", 0));
                                                                    java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                                    c(r4[3], (byte) (-$$a[52]), r4[41], objArr69);
                                                                    obj20 = cls24.getMethod((java.lang.String) objArr69[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj20);
                                                                }
                                                                int intValue7 = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).intValue();
                                                                c2 = 0;
                                                                ((int[]) objArr67[4])[0] = intValue7;
                                                                objArr5 = objArr67;
                                                                if (((int[]) objArr5[1])[c2] != i5) {
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
                                                        b("跴\ue113哰쮳㼔鋄Ǝ畁\ue8ea徒덫☱", 27823 - android.view.KeyEvent.normalizeMetaState(0), objArr70);
                                                        java.lang.Object[] objArr71 = {((java.lang.String) objArr70[0]).intern()};
                                                        java.lang.Integer num5 = num2;
                                                        java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                        if (obj21 == null) {
                                                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 36, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3160, (char) (33100 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                            java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                            c(r4[41], (byte) (-$$a[52]), (short) ($$b | 33), objArr72);
                                                            obj21 = cls25.getMethod((java.lang.String) objArr72[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj21);
                                                        }
                                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr71)).longValue();
                                                        long j19 = i5;
                                                        long j20 = ~j19;
                                                        long j21 = (434 * longValue7) + 462266884656L + ((~(j20 | 1070062232 | longValue7)) * 433) + (((~((~longValue7) | j19)) | 1070062232) * (-433)) + (((~(longValue7 | (-1070062233))) | (~(1070062232 | j19))) * 433) + 1977532971;
                                                        int i26 = ~((-51817574) | i21);
                                                        if (((((int) (j21 >> 32)) & ((((~((-1491686291) | i5)) | 1489043984 | i26) * (-470)) + 1208229642 + ((i26 | (~((-2642307) | i5))) * 470))) | (((int) j21) & (((((~((-274353239) | i21)) | 1711579648) * (-591)) - 276962002) + (((-274353239) | i5) * 591)))) != 0) {
                                                            objArr2 = new java.lang.Object[]{new int[]{i5}, new int[]{i5 ^ 50}, null, null, new int[1]};
                                                            java.lang.Object[] objArr73 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~(324109230 | i5)) | 671358032) * (-140)) + 1994556048 + ((~(995467262 | i5)) * 70) + (((~(706026714 | i5)) | 960798580) * 70))};
                                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj22 == null) {
                                                                java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                                                byte[] bArr = $$a;
                                                                byte b9 = bArr[3];
                                                                byte b10 = (byte) (-bArr[52]);
                                                                short s = bArr[41];
                                                                java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                                c(b9, b10, s, objArr74);
                                                                obj22 = cls26.getMethod((java.lang.String) objArr74[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj22);
                                                            }
                                                            i7 = 0;
                                                            ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr73)).intValue();
                                                        } else {
                                                            objArr2 = new java.lang.Object[]{new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                                                            java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((~((-134219841) | i21)) * 130) - 905103448) + (((~((-134219841) | i5)) | 805736496) * 130))};
                                                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj23 == null) {
                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 50, 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                                c(r14[3], (byte) (-$$a[52]), r14[41], objArr76);
                                                                obj23 = cls27.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj23);
                                                            }
                                                            i7 = 0;
                                                            ((int[]) objArr2[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr75)).intValue();
                                                        }
                                                        if (((int[]) objArr2[1])[i7] != i5) {
                                                            return objArr2;
                                                        }
                                                        java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                        b("跴貟迌踍襳训諼蕵萕蝄膕胩茡艵鲆龑黛餝顦骫", android.text.TextUtils.getOffsetBefore("", i7) + 311, objArr77);
                                                        java.lang.Object[] objArr78 = {((java.lang.String) objArr77[i7]).intern()};
                                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num5);
                                                        if (obj24 == null) {
                                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.Process.myTid() >> 22), 3162 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (android.view.View.combineMeasuredStates(0, 0) + 33099));
                                                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                            c(r4[41], (byte) (-$$a[52]), (short) ($$b | 33), objArr79);
                                                            obj24 = cls28.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num5, obj24);
                                                        }
                                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr78)).longValue();
                                                        long j22 = ~longValue8;
                                                        long j23 = ~(longValue8 | 609064831);
                                                        long j24 = (longValue8 * 371) + 225963052301L + (((~(j19 | (-609064832))) | (~(j22 | j20))) * (-370)) + (((~((-609064832) | j20)) | (~(j22 | j19)) | j23) * (-370)) + (j23 * 370) + 298405907;
                                                        if (((((int) (j24 >> 32)) & (((((~((-100499316) | i21)) | 72886881) * (-160)) - 885753142) + (((~((-1537725727) | i21)) | (-100499316)) * 160))) | (((int) j24) & (((((~((-390026265) | i5)) | 69795840) * (-566)) - 587486635) + ((~((-320230425) | i5)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST)))) != 0) {
                                                            objArr3 = new java.lang.Object[]{new int[]{i5}, new int[]{i5 ^ 60}, null, null, new int[1]};
                                                            java.lang.Object[] objArr80 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((1041252361 | i21) * 1324) + 1979941080) + (((~(1058160701 | i5)) | (~((-28024757) | i5))) * (-1324))) - 883429084)};
                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj25 == null) {
                                                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                                c(r4[3], (byte) (-$$a[52]), r4[41], objArr81);
                                                                obj25 = cls29.getMethod((java.lang.String) objArr81[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj25);
                                                            }
                                                            i8 = 0;
                                                            ((int[]) objArr3[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr80)).intValue();
                                                        } else {
                                                            objArr3 = new java.lang.Object[]{new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                                                            java.lang.Object[] objArr82 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((974146052 | r1) * (-280)) - 74971488) + (((~((-1001974566) | i5)) | (~((-28161380) | i5))) * 140) + (((~((-27828514) | i5)) | (~((-974146053) | i21)) | (~((-332867) | i21))) * 140))};
                                                            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj26 == null) {
                                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) android.graphics.Color.red(0));
                                                                java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                                c(r3[3], (byte) (-$$a[52]), r3[41], objArr83);
                                                                obj26 = cls30.getMethod((java.lang.String) objArr83[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj26);
                                                            }
                                                            int intValue8 = ((java.lang.Integer) ((java.lang.reflect.Method) obj26).invoke(null, objArr82)).intValue();
                                                            i8 = 0;
                                                            ((int[]) objArr3[4])[0] = intValue8;
                                                        }
                                                        if (((int[]) objArr3[1])[i8] != i5) {
                                                            return objArr3;
                                                        }
                                                        java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                        a(null, null, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0083\u0084\u0083\u0082\u0092\u0091\u0090\u008f\u0081\u0082\u008e\u0086\u008d\u0082\u008c\u0083\u0088\u008b\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0081\u0083\u0084\u0083\u0082\u0081\u0083\u0084\u0083\u0082\u0081", objArr84);
                                                        java.lang.Object[] objArr85 = {((java.lang.String) objArr84[i8]).intern()};
                                                        java.lang.Integer num6 = num;
                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                        if (obj27 == null) {
                                                            java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.resolveSize(i8, i8), 3161 - android.text.TextUtils.indexOf("", "", i8, i8), (char) (33099 - android.graphics.Color.blue(i8)));
                                                            byte b11 = (byte) $$b;
                                                            byte b12 = $$a[14];
                                                            java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                            c(b11, b12, (short) (b12 | 40), objArr86);
                                                            obj27 = cls31.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj27);
                                                        }
                                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr85)).longValue();
                                                        long j25 = (((-219) * longValue9) - 107410686305L) + (((~((~longValue9) | 486021204)) | (~((-486021205) | j20 | longValue9))) * 220) + (((~(j20 | longValue9)) | (-486021205)) * (-440)) + ((longValue9 | (-486021205) | j19) * 220) + 1481456108;
                                                        int i27 = (int) j25;
                                                        int i28 = ~((-1312583886) | i5);
                                                        if (((((int) (j25 >> 32)) & ((((-33587465) | i5) * (-627)) + 635053320 + (((~((-1375567523) | i5)) | 61658888) * (-627)) + (((~(i21 | 1375567522)) | (~(61658888 | i5))) * 627))) | (i27 & ((((~(1312583885 | i5)) | (-1333654750) | (~(124642524 | i5))) * (-880)) + 818884229 + (((~(i21 | 1312583885)) | (-124642525) | i28) * (-880)) + (i28 * 880)))) != 0) {
                                                            objArr4 = new java.lang.Object[]{new int[]{i5}, new int[]{i5 ^ 80}, null, null, new int[1]};
                                                            java.lang.Object[] objArr87 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((~(2629092 | i5)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1033281324 + (((~(i21 | 2629092)) | 2621604) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                                            java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj28 == null) {
                                                                java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) android.graphics.Color.green(0));
                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                c(r5[3], (byte) (-$$a[52]), r5[41], objArr88);
                                                                obj28 = cls32.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj28);
                                                            }
                                                            i9 = 0;
                                                            ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr87)).intValue();
                                                        } else {
                                                            objArr4 = new java.lang.Object[]{new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                                                            java.lang.Object[] objArr89 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((925762922 | i5) * 140) + 1241876736 + (((~(i21 | 925762922)) | 1088020) * (-280)) + (((~(i21 | 104373022)) | 822477920 | (~((-1088021) | i5))) * 140))};
                                                            java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj29 == null) {
                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                c(r5[3], (byte) (-$$a[52]), r5[41], objArr90);
                                                                obj29 = cls33.getMethod((java.lang.String) objArr90[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj29);
                                                            }
                                                            i9 = 0;
                                                            ((int[]) objArr4[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr89)).intValue();
                                                        }
                                                        if (((int[]) objArr4[1])[i9] != i5) {
                                                            return objArr4;
                                                        }
                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                        b("跴\uec78临꣺દ攗윕⇋莗\ue245尲븵ᣠ窭픗㜑采\uf383剋챻\u2e79裩\ueaaf䕞꜁Ǜ掄쉂㰱鸴\uf8fc媣땗ᝒ燆펞㉆걻ิ梥쪵╩", 25031 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr91);
                                                        java.lang.Object[] objArr92 = {((java.lang.String) objArr91[i9]).intern()};
                                                        java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num6);
                                                        if (obj30 == null) {
                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.red(i9), 3209 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (33099 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                                                            byte b13 = (byte) $$b;
                                                            byte b14 = $$a[14];
                                                            java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                            c(b13, b14, (short) (b14 | 40), objArr93);
                                                            obj30 = cls34.getMethod((java.lang.String) objArr93[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num6, obj30);
                                                        }
                                                        long j26 = ~((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr92)).longValue();
                                                        long j27 = ~(j19 | j26);
                                                        long j28 = ((r1 * 246) - 207349074028L) + (((~(j26 | 849791287)) | (~(j20 | j26))) * (-245)) + ((-245) * j27) + ((849791287 | j27) * 245) + 145643616;
                                                        int i29 = ~(i21 | 858065562);
                                                        if (((((int) j28) & ((((~(i21 | (-1092984285))) | 300492) * (-160)) + 1689646069 + (((~(i21 | 344242125)) | (-1092984285)) * 160))) | (((int) (j28 >> 32)) & (((8405248 | i29) * (-712)) + 425565658 + (((~(i21 | (-8405249))) | (~(866470810 | i5))) * (-712)) + ((i29 | (-579160849)) * 712)))) != 0) {
                                                            java.lang.Object[] objArr94 = {new int[]{i5}, new int[]{i5 ^ 90}, null, null, new int[1]};
                                                            java.lang.Object[] objArr95 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~((-679473998) | i5)) | (-350661948)) * (-318)) - 1781814556) + (((~((-350661948) | i5)) | (~(i21 | 1023410047))) * 318) + (((~(i21 | (-343936051))) | (~(1023410047 | i5))) * 318))};
                                                            java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                            if (obj31 == null) {
                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 2713 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                c(r4[3], (byte) (-$$a[52]), r4[41], objArr96);
                                                                obj31 = cls35.getMethod((java.lang.String) objArr96[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj31);
                                                            }
                                                            ((int[]) objArr94[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr95)).intValue();
                                                            return objArr94;
                                                        }
                                                        java.lang.Object[] objArr97 = {new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                                                        int i30 = ~(i21 | (-282641332));
                                                        java.lang.Object[] objArr98 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf(((738532420 | i30 | (~(282641331 | i5))) * (-338)) + 1545990736 + ((i30 | (~(1021173751 | i5))) * 338))};
                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                        if (obj32 == null) {
                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                                            java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                            c(r3[3], (byte) (-$$a[52]), r3[41], objArr99);
                                                            obj32 = cls36.getMethod((java.lang.String) objArr99[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj32);
                                                        }
                                                        ((int[]) objArr97[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr98)).intValue();
                                                        return objArr97;
                                                    }
                                                    i18 = i10 + 1;
                                                    invoke = r37;
                                                    num4 = num;
                                                    str8 = str3;
                                                    num3 = num2;
                                                }
                                            }
                                            java.lang.String str11 = invoke;
                                            num = num4;
                                            num2 = num3;
                                            java.lang.String str12 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(str11);
                                            int i31 = 6;
                                            if (str12.length() >= 6) {
                                                int i32 = 0;
                                                r15 = r15;
                                                i10 = i10;
                                                r37 = r37;
                                                while (i32 <= str12.length() - i31) {
                                                    java.lang.Object[] objArr100 = {str12.substring(i32, i32 + 6), 931995};
                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj33 == null) {
                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, 2593 - android.os.Process.getGidForName(""), (char) android.view.View.resolveSize(0, 0));
                                                        byte b15 = $$a[41];
                                                        byte b16 = b15;
                                                        r30 = str12;
                                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                        c(b15, b16, (short) (b16 | 653), objArr101);
                                                        obj33 = cls37.getMethod((java.lang.String) objArr101[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj33);
                                                    } else {
                                                        r30 = str12;
                                                    }
                                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr100)).longValue();
                                                    long j29 = ~longValue10;
                                                    long j30 = i17;
                                                    int i33 = i32;
                                                    str3 = r15;
                                                    long j31 = ((-167) * longValue10) + 105974303723L + (((~(j29 | 634576668)) | (~(j29 | j30))) * 336) + (((~((-634576669) | longValue10)) | (~((-634576669) | j30))) * (-168)) + ((j29 | (~((~j30) | (-634576669)))) * 168) + 1891677193;
                                                    int i34 = (int) (j31 >> 32);
                                                    int i35 = ~i17;
                                                    if (((((int) j31) & ((((~((-26101566) | i17)) | 8799000) * 1504) + 1320243365 + ((~((-17302566) | i17)) * (-1504)) + 1188703408)) | (((((~(533452983 | i17)) | (~((-1970679395) | i35))) * (-370)) + 635053406 + (((~(533452983 | i35)) | (~((-1970679395) | i17)) | 176803989) * (-370)) + 992966490) & i34)) == -2096167706) {
                                                        objArr = new java.lang.Object[]{new int[1], new int[1], null, r3, new int[1]};
                                                        java.lang.String str13 = (java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(str11);
                                                        ((int[]) objArr[0])[0] = i17;
                                                        ((int[]) objArr[1])[0] = i17 ^ 20;
                                                        java.lang.Object[] objArr102 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf((((~((-719495757) | i35)) | 42115596 | (~((-310640189) | i35))) * (-1136)) + 2031799880 + (((~((-719495757) | i17)) | (~((-310640189) | i17)) | (~(988020348 | i35))) * (-568)) + (((~(i35 | 719495756)) | (~(310640188 | i35)) | (~((-42115597) | i17))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                                        str6 = str3;
                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str6);
                                                        if (obj34 == null) {
                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.argb(0, 0, 0, 0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                            java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                            c(r4[3], (byte) (-$$a[52]), r4[41], objArr103);
                                                            obj34 = cls38.getMethod((java.lang.String) objArr103[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str6, obj34);
                                                        }
                                                        ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr102)).intValue();
                                                        i5 = i17;
                                                        str2 = str6;
                                                        i6 = 1;
                                                        c = 0;
                                                        if (((int[]) objArr[i6])[c] == i5) {
                                                        }
                                                    } else {
                                                        i32 = i33 + 1;
                                                        r15 = str3;
                                                        str12 = r30;
                                                        i31 = 6;
                                                        i10 = r30;
                                                        r37 = j29;
                                                    }
                                                }
                                            }
                                            java.lang.String str14 = r15;
                                            java.lang.String substring = ((java.lang.String) java.lang.Class.forName(intern2).getField(intern3).get(str11)).substring(0, indexOf);
                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                            b("跴", 64320 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr104);
                                            java.lang.String[] split = substring.split(((java.lang.String) objArr104[0]).intern());
                                            int i36 = 0;
                                            ?? r2 = split.length;
                                            ?? r302 = i10;
                                            int i37 = r37;
                                            ?? r38 = j;
                                            while (i36 < r2) {
                                                java.lang.String str15 = split[i36];
                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                b("趀哮㾰", 55579 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr105);
                                                if (str15.split(((java.lang.String) objArr105[0]).intern()).length > 1) {
                                                    r6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1581, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    synchronized (r6) {
                                                        try {
                                                            try {
                                                                try {
                                                                    java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                    b("趫\ue6c3嬑쿨\u2066铡ऑ緈혃䪧뼪Ꮇ蓆淚淘왳", 27509 - android.text.TextUtils.getCapsMode("", 0, 0), objArr106);
                                                                    intern = ((java.lang.String) objArr106[0]).intern();
                                                                    try {
                                                                        runtime = java.lang.Runtime.getRuntime();
                                                                        r302 = split;
                                                                    } catch (java.lang.Exception unused) {
                                                                    }
                                                                } catch (java.lang.Throwable th5) {
                                                                    th = th5;
                                                                    r38 = r6;
                                                                }
                                                            } catch (java.io.IOException unused2) {
                                                                r302 = split;
                                                            }
                                                        } catch (java.io.IOException unused3) {
                                                        }
                                                        try {
                                                            try {
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                b("趨\uf674", 31735 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr107);
                                                                exec = runtime.exec(((java.lang.String) objArr107[0]).intern(), (java.lang.String[]) null, (java.io.File) null);
                                                                try {
                                                                    java.lang.Object[] objArr108 = {exec.getInputStream()};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                                    if (obj35 == null) {
                                                                        str3 = r2;
                                                                        try {
                                                                            obj35 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0) + 44, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1506, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getDeclaredConstructor(java.io.InputStream.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj35);
                                                                        } catch (java.lang.Throwable th6) {
                                                                            th = th6;
                                                                            cause = th.getCause();
                                                                            if (cause == null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        str3 = r2;
                                                                    }
                                                                    try {
                                                                        newInstance = ((java.lang.reflect.Constructor) obj35).newInstance(objArr108);
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
                                                            } catch (java.lang.Exception unused4) {
                                                            }
                                                            try {
                                                                try {
                                                                    java.lang.Object[] objArr109 = {exec.getErrorStream()};
                                                                    java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(40835744);
                                                                    if (obj36 == null) {
                                                                        try {
                                                                            i37 = i36;
                                                                            try {
                                                                                obj36 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1507, (char) (android.os.Process.myPid() >> 22))).getDeclaredConstructor(java.io.InputStream.class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(40835744, obj36);
                                                                            } catch (java.lang.Throwable th9) {
                                                                                th = th9;
                                                                                th2 = th;
                                                                                cause2 = th2.getCause();
                                                                                if (cause2 == null) {
                                                                                    throw cause2;
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        } catch (java.lang.Throwable th10) {
                                                                            th = th10;
                                                                        }
                                                                    } else {
                                                                        i37 = i36;
                                                                    }
                                                                    try {
                                                                        newInstance2 = ((java.lang.reflect.Constructor) obj36).newInstance(objArr109);
                                                                        try {
                                                                            dataOutputStream = new java.io.DataOutputStream(exec.getOutputStream());
                                                                            try {
                                                                                java.lang.Class<?> cls39 = java.lang.Class.forName(intern4);
                                                                                str4 = str14;
                                                                                try {
                                                                                    java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                                    try {
                                                                                        b("趨ꏐ텄۔㑓", android.graphics.Color.rgb(0, 0, 0) + 16789119, objArr110);
                                                                                        cls39.getMethod(((java.lang.String) objArr110[0]).intern(), null).invoke(newInstance, null);
                                                                                        try {
                                                                                            java.lang.Class<?> cls40 = java.lang.Class.forName(intern4);
                                                                                            java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                                            b("趨ꏐ텄۔㑓", 11903 - android.view.KeyEvent.keyCodeFromString(""), objArr111);
                                                                                            cls40.getMethod(((java.lang.String) objArr111[0]).intern(), null).invoke(newInstance2, null);
                                                                                            try {
                                                                                                try {
                                                                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                                    sb.append(intern);
                                                                                                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                                                                                                    a(null, null, 127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u009d", objArr112);
                                                                                                    sb.append(((java.lang.String) objArr112[0]).intern());
                                                                                                    java.lang.String obj37 = sb.toString();
                                                                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                                                    a(null, null, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "¡ \u009f\u009b\u009e", objArr113);
                                                                                                    dataOutputStream.write(obj37.getBytes(((java.lang.String) objArr113[0]).intern()));
                                                                                                    dataOutputStream.flush();
                                                                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                                                                    b("趾빈\uea64᙮䉽", 13291 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr114);
                                                                                                    java.lang.String intern5 = ((java.lang.String) objArr114[0]).intern();
                                                                                                    java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                                                                    a(null, null, 127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "¡ \u009f\u009b\u009e", objArr115);
                                                                                                    dataOutputStream.write(intern5.getBytes(((java.lang.String) objArr115[0]).intern()));
                                                                                                    dataOutputStream.flush();
                                                                                                } catch (java.lang.Throwable th11) {
                                                                                                    th = th11;
                                                                                                }
                                                                                            } catch (java.io.IOException unused5) {
                                                                                                str14 = intern2;
                                                                                                r38 = r6;
                                                                                                intern2 = str11;
                                                                                                str11 = str4;
                                                                                                r6 = i2;
                                                                                            } catch (java.lang.Exception unused6) {
                                                                                            }
                                                                                        } catch (java.lang.Throwable th12) {
                                                                                            java.lang.Throwable cause4 = th12.getCause();
                                                                                            if (cause4 != null) {
                                                                                                throw cause4;
                                                                                            }
                                                                                            throw th12;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th13) {
                                                                                        th = th13;
                                                                                        java.lang.Throwable th14 = th;
                                                                                        java.lang.Throwable cause5 = th14.getCause();
                                                                                        if (cause5 != null) {
                                                                                            throw cause5;
                                                                                        }
                                                                                        throw th14;
                                                                                    }
                                                                                } catch (java.lang.Throwable th15) {
                                                                                    th = th15;
                                                                                }
                                                                            } catch (java.lang.Throwable th16) {
                                                                                th = th16;
                                                                            }
                                                                        } catch (java.io.IOException unused7) {
                                                                            r38 = r6;
                                                                            r6 = i17;
                                                                            java.lang.String str16 = str14;
                                                                            str14 = intern2;
                                                                            intern2 = str11;
                                                                            str11 = str16;
                                                                            i36 = i37 + 1;
                                                                            i17 = r6;
                                                                            split = r302;
                                                                            r2 = str3;
                                                                            java.lang.String str17 = str11;
                                                                            str11 = intern2;
                                                                            intern2 = str14;
                                                                            str14 = str17;
                                                                            r302 = r302;
                                                                            i37 = i37;
                                                                            r38 = r38;
                                                                        } catch (java.lang.Exception unused8) {
                                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                            b("趝\ud9ab▐熄\uddfa⧪疝쇘ⴼ祢씒ᄒ絲쥧ᕁ慁쳫ᢛ擉냨\u1cfd棑듎9氰렁я", (android.os.Process.myPid() >> 22) + 21521, objArr116);
                                                                            throw new java.io.IOException(((java.lang.String) objArr116[0]).intern());
                                                                        }
                                                                    } catch (java.lang.Throwable th17) {
                                                                        th = th17;
                                                                        th2 = th;
                                                                        cause2 = th2.getCause();
                                                                        if (cause2 == null) {
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th18) {
                                                                    th = th18;
                                                                }
                                                            } catch (java.io.IOException unused9) {
                                                                i37 = i36;
                                                                r38 = r6;
                                                                r6 = i17;
                                                                java.lang.String str162 = str14;
                                                                str14 = intern2;
                                                                intern2 = str11;
                                                                str11 = str162;
                                                                i36 = i37 + 1;
                                                                i17 = r6;
                                                                split = r302;
                                                                r2 = str3;
                                                                java.lang.String str172 = str11;
                                                                str11 = intern2;
                                                                intern2 = str14;
                                                                str14 = str172;
                                                                r302 = r302;
                                                                i37 = i37;
                                                                r38 = r38;
                                                            } catch (java.lang.Exception unused10) {
                                                                java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                                b("趝\ud9ab▐熄\uddfa⧪疝쇘ⴼ祢씒ᄒ絲쥧ᕁ慁쳫ᢛ擉냨\u1cfd棑듎9氰렁я", (android.os.Process.myPid() >> 22) + 21521, objArr1162);
                                                                throw new java.io.IOException(((java.lang.String) objArr1162[0]).intern());
                                                            }
                                                        } catch (java.io.IOException unused11) {
                                                            str3 = r2;
                                                            i37 = i36;
                                                            r38 = r6;
                                                            r6 = i17;
                                                            java.lang.String str1622 = str14;
                                                            str14 = intern2;
                                                            intern2 = str11;
                                                            str11 = str1622;
                                                            i36 = i37 + 1;
                                                            i17 = r6;
                                                            split = r302;
                                                            r2 = str3;
                                                            java.lang.String str1722 = str11;
                                                            str11 = intern2;
                                                            intern2 = str14;
                                                            str14 = str1722;
                                                            r302 = r302;
                                                            i37 = i37;
                                                            r38 = r38;
                                                        } catch (java.lang.Exception unused12) {
                                                            java.lang.Object[] objArr11622 = new java.lang.Object[1];
                                                            b("趝\ud9ab▐熄\uddfa⧪疝쇘ⴼ祢씒ᄒ絲쥧ᕁ慁쳫ᢛ擉냨\u1cfd棑듎9氰렁я", (android.os.Process.myPid() >> 22) + 21521, objArr11622);
                                                            throw new java.io.IOException(((java.lang.String) objArr11622[0]).intern());
                                                        }
                                                        try {
                                                            long nanoTime = java.lang.System.nanoTime();
                                                            long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                            java.lang.Object obj38 = r6;
                                                            while (true) {
                                                                try {
                                                                    exec.exitValue();
                                                                    str14 = intern2;
                                                                    r38 = obj38;
                                                                    str5 = str11;
                                                                    break;
                                                                } catch (java.lang.IllegalThreadStateException unused13) {
                                                                    if (nanos > 0) {
                                                                        try {
                                                                            str14 = intern2;
                                                                            obj = obj38;
                                                                            try {
                                                                                try {
                                                                                    java.lang.Object[] objArr117 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                    java.lang.Class<?> cls41 = java.lang.Class.forName(intern4);
                                                                                    str5 = str11;
                                                                                    try {
                                                                                        java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                                                        b("趨薲鶴閱궿", android.view.KeyEvent.normalizeMetaState(0) + 2053, objArr118);
                                                                                        cls41.getMethod(((java.lang.String) objArr118[0]).intern(), java.lang.Long.TYPE).invoke(null, objArr117);
                                                                                    } catch (java.lang.Throwable th19) {
                                                                                        th = th19;
                                                                                        java.lang.Throwable th20 = th;
                                                                                        java.lang.Throwable cause6 = th20.getCause();
                                                                                        if (cause6 != null) {
                                                                                            throw cause6;
                                                                                        }
                                                                                        throw th20;
                                                                                    }
                                                                                } catch (java.lang.Throwable th21) {
                                                                                    th = th21;
                                                                                }
                                                                            } catch (java.lang.InterruptedException e) {
                                                                                e = e;
                                                                                str5 = str11;
                                                                                throw e;
                                                                            } catch (java.lang.Throwable th22) {
                                                                                th = th22;
                                                                                str5 = str11;
                                                                                th3 = th;
                                                                                try {
                                                                                    exec.destroy();
                                                                                    throw th3;
                                                                                } catch (java.lang.Exception unused14) {
                                                                                    throw th3;
                                                                                }
                                                                            }
                                                                        } catch (java.lang.InterruptedException e2) {
                                                                            e = e2;
                                                                        } catch (java.lang.Throwable th23) {
                                                                            th = th23;
                                                                        }
                                                                    } else {
                                                                        str14 = intern2;
                                                                        obj = obj38;
                                                                        str5 = str11;
                                                                    }
                                                                    try {
                                                                        long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - nanoTime);
                                                                        r38 = obj;
                                                                        if (nanos2 > 0) {
                                                                            intern2 = str14;
                                                                            obj38 = obj;
                                                                            str11 = str5;
                                                                            nanos = nanos2;
                                                                        }
                                                                    } catch (java.lang.InterruptedException e3) {
                                                                        e = e3;
                                                                        throw e;
                                                                    } catch (java.lang.Throwable th24) {
                                                                        th = th24;
                                                                        th3 = th;
                                                                        exec.destroy();
                                                                        throw th3;
                                                                    }
                                                                } catch (java.lang.InterruptedException e4) {
                                                                    throw e4;
                                                                } catch (java.lang.Throwable th25) {
                                                                    th3 = th25;
                                                                    exec.destroy();
                                                                    throw th3;
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    dataOutputStream.close();
                                                                } catch (java.io.IOException unused15) {
                                                                }
                                                                try {
                                                                    try {
                                                                        java.lang.Class<?> cls42 = java.lang.Class.forName(intern4);
                                                                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                        a(null, null, android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u008c\u008e\u0086\u009a", objArr119);
                                                                        cls42.getMethod(((java.lang.String) objArr119[0]).intern(), java.lang.Long.TYPE).invoke(newInstance, 100L);
                                                                        try {
                                                                            java.lang.Class<?> cls43 = java.lang.Class.forName(intern4);
                                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                            a(null, null, 126 - android.os.Process.getGidForName(""), "\u008c\u008e\u0086\u009a", objArr120);
                                                                            cls43.getMethod(((java.lang.String) objArr120[0]).intern(), java.lang.Long.TYPE).invoke(newInstance2, 10L);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        exec.destroy();
                                                                                    } catch (java.lang.Exception unused16) {
                                                                                    }
                                                                                } catch (java.lang.Throwable th26) {
                                                                                    th = th26;
                                                                                    java.lang.Throwable th27 = th;
                                                                                    throw th27;
                                                                                }
                                                                            } catch (java.io.IOException unused17) {
                                                                            }
                                                                            try {
                                                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 1508 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                                                                byte[] bArr2 = $$a;
                                                                                byte b17 = bArr2[18];
                                                                                byte b18 = bArr2[41];
                                                                                java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                c(b17, b18, (short) (b18 + 3), objArr121);
                                                                                sb2.append(cls44.getField((java.lang.String) objArr121[0]).get(newInstance).toString());
                                                                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 44, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1506, (char) android.text.TextUtils.getOffsetBefore("", 0));
                                                                                byte b19 = bArr2[18];
                                                                                byte b20 = bArr2[41];
                                                                                java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                c(b19, b20, (short) (b20 + 3), objArr122);
                                                                                sb2.append(cls45.getField((java.lang.String) objArr122[0]).get(newInstance2).toString());
                                                                                java.lang.String obj39 = sb2.toString();
                                                                                java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                a(null, null, 127 - android.view.View.combineMeasuredStates(0, 0), "\u009d", objArr123);
                                                                                java.lang.String[] split2 = obj39.split(((java.lang.String) objArr123[0]).intern());
                                                                                int length = split2.length;
                                                                                int i38 = 0;
                                                                                while (i38 < length) {
                                                                                    java.lang.String str18 = split2[i38];
                                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                    a(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0088\u0093\u0097\u0089\u0086\u0086\u0089\u0088\u0087\u0086\u0085£\u0093\u0089\u0083¢\u0085\u0083\u0096", objArr124);
                                                                                    if (!str18.startsWith(((java.lang.String) objArr124[0]).intern())) {
                                                                                        java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                        b("趫\u0fdb襺ઓ萾ٙ菸ᵆ麰ᣝ驼\u17de鄶ፘ곱⸆ꮤ◃ꝭ\u20c6", 33376 - android.view.MotionEvent.axisFromString(""), objArr125);
                                                                                        if (str18.startsWith(((java.lang.String) objArr125[0]).intern())) {
                                                                                            continue;
                                                                                        } else {
                                                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                            a(null, null, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 127, "£\u0093\u0089\u0083¢\u0085\u0083\u0096", objArr126);
                                                                                            if (str18.startsWith(((java.lang.String) objArr126[0]).intern())) {
                                                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                                b("跡", 25819 - android.graphics.Color.alpha(0), objArr127);
                                                                                                java.lang.String[] split3 = str18.split(((java.lang.String) objArr127[0]).intern());
                                                                                                if (split3.length > 1 && split3[1].equalsIgnoreCase(str15)) {
                                                                                                    objArr = new java.lang.Object[]{new int[1], new int[1], null, r2, new int[1]};
                                                                                                    java.lang.String str19 = (java.lang.String) java.lang.Class.forName(str14).getField(intern3).get(str5);
                                                                                                    i5 = i2;
                                                                                                    ((int[]) objArr[0])[0] = i5;
                                                                                                    ((int[]) objArr[1])[0] = i5 ^ 20;
                                                                                                    java.lang.Object[] objArr128 = {java.lang.Integer.valueOf(i4), 16, java.lang.Integer.valueOf(((((~((-969248752) | r2)) | (~(1004904447 | i5))) * (-831)) - 35653454) + ((~((-944017255) | i5)) * (-1662)) + (((~((~i5) | (-60887194))) | (~(60887193 | i5)) | (~(969248751 | i5))) * 831))};
                                                                                                    str2 = str4;
                                                                                                    java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                                                                                    if (obj40 == null) {
                                                                                                        java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0), 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                                                        java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                                        c(r3[3], (byte) (-$$a[52]), r3[41], objArr129);
                                                                                                        obj40 = cls46.getMethod((java.lang.String) objArr129[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj40);
                                                                                                    }
                                                                                                    ((int[]) objArr[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr128)).intValue();
                                                                                                    i6 = 1;
                                                                                                    c = 0;
                                                                                                    if (((int[]) objArr[i6])[c] == i5) {
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    i38++;
                                                                                    str5 = str5;
                                                                                    str4 = str4;
                                                                                }
                                                                                r6 = i2;
                                                                                str11 = str4;
                                                                                intern2 = str5;
                                                                            } catch (java.lang.Exception unused18) {
                                                                                java.lang.Object[] objArr116222 = new java.lang.Object[1];
                                                                                b("趝\ud9ab▐熄\uddfa⧪疝쇘ⴼ祢씒ᄒ絲쥧ᕁ慁쳫ᢛ擉냨\u1cfd棑듎9氰렁я", (android.os.Process.myPid() >> 22) + 21521, objArr116222);
                                                                                throw new java.io.IOException(((java.lang.String) objArr116222[0]).intern());
                                                                            }
                                                                        } catch (java.lang.Throwable th28) {
                                                                            java.lang.Throwable cause7 = th28.getCause();
                                                                            if (cause7 != null) {
                                                                                throw cause7;
                                                                            }
                                                                            throw th28;
                                                                        }
                                                                    } catch (java.lang.Throwable th29) {
                                                                        java.lang.Throwable cause8 = th29.getCause();
                                                                        if (cause8 != null) {
                                                                            throw cause8;
                                                                        }
                                                                        throw th29;
                                                                    }
                                                                } catch (java.lang.InterruptedException e5) {
                                                                    e = e5;
                                                                    throw e;
                                                                }
                                                            } catch (java.lang.InterruptedException e6) {
                                                                e = e6;
                                                                throw e;
                                                            } catch (java.lang.Throwable th30) {
                                                                th = th30;
                                                                th3 = th;
                                                                exec.destroy();
                                                                throw th3;
                                                            }
                                                        } catch (java.lang.InterruptedException e7) {
                                                            e = e7;
                                                        } catch (java.lang.Throwable th31) {
                                                            th = th31;
                                                        }
                                                    }
                                                } else {
                                                    r302 = split;
                                                    str3 = r2;
                                                    i37 = i36;
                                                    r6 = i17;
                                                    java.lang.String str20 = str14;
                                                    str14 = intern2;
                                                    intern2 = str11;
                                                    str11 = str20;
                                                }
                                                i36 = i37 + 1;
                                                i17 = r6;
                                                split = r302;
                                                r2 = str3;
                                                java.lang.String str17222 = str11;
                                                str11 = intern2;
                                                intern2 = str14;
                                                str14 = str17222;
                                                r302 = r302;
                                                i37 = i37;
                                                r38 = r38;
                                            }
                                            i5 = i17;
                                            str2 = str14;
                                        } else {
                                            num = 269015277;
                                            num2 = -604620973;
                                            i5 = i17;
                                            str2 = r15;
                                        }
                                        java.lang.Object[] objArr130 = {new int[]{i5}, new int[]{i5}, null, null, new int[1]};
                                        int i39 = ~i5;
                                        java.lang.Object[] objArr131 = {java.lang.Integer.valueOf(i4), 0, java.lang.Integer.valueOf((((1006600040 | i39) * (-369)) - 1101790064) + (((~((-33520417) | i39)) | 996615528) * (-369)) + (((~(i39 | (-9984513))) | (~(33520416 | i5)) | 973079624) * 369))};
                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(str2);
                                        if (obj41 == null) {
                                            java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                            java.lang.Object[] objArr132 = new java.lang.Object[1];
                                            c(r3[3], (byte) (-$$a[52]), r3[41], objArr132);
                                            obj41 = cls47.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(str2, obj41);
                                        }
                                        int intValue9 = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr131)).intValue();
                                        c = 0;
                                        ((int[]) objArr130[4])[0] = intValue9;
                                        objArr = objArr130;
                                        i6 = 1;
                                        if (((int[]) objArr[i6])[c] == i5) {
                                        }
                                    } catch (java.lang.Throwable th32) {
                                        java.lang.Throwable cause9 = th32.getCause();
                                        if (cause9 != null) {
                                            throw cause9;
                                        }
                                        throw th32;
                                    }
                                } catch (java.lang.Throwable th33) {
                                    java.lang.Throwable cause10 = th33.getCause();
                                    if (cause10 != null) {
                                        throw cause10;
                                    }
                                    throw th33;
                                }
                            }
                        });
                        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 117) % 128;
                    }
                } else {
                    continue;
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        return this.getAid.requestReplenish(AlternateContactlessPaymentDataJson(), (com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[]) arrayList.toArray(new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[arrayList.size()]));
    }

    @Override // com.payair.hce.sendRequest
    public final void getProfileVersion() {
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 107) % 128;
        java.lang.String AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson();
        java.util.Iterator<java.lang.String> it = this.writeReplace.RecordsJson(AlternateContactlessPaymentDataJson).iterator();
        while (it.hasNext()) {
            int i = SdkCoreBusinessLogicModuleImpl + 73;
            getCiacDecline = i % 128;
            if (i % 2 != 0) {
                com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(this.writeReplace.values(AlternateContactlessPaymentDataJson, it.next()));
                throw new java.lang.NullPointerException();
            }
            java.lang.String next = it.next();
            try {
                com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace valueOf2 = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(this.writeReplace.values(AlternateContactlessPaymentDataJson, next));
                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 47) % 128;
                byte[] DigitizedCardProfile = this.writeReplace.DigitizedCardProfile(AlternateContactlessPaymentDataJson, next);
                if (valueOf2 == com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf) {
                    com.payair.hce.isNetworkError writeReplace = com.payair.hce.getAssets.writeReplace(DigitizedCardProfile);
                    this.writeReplace.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson, writeReplace.getProfileVersion(), com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.values.DigitizedCardProfile(), com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis())));
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.onContextItemSelected oncontextitemselected = (com.payair.hce.onContextItemSelected) objArr[0];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = oncontextitemselected.writeReplace.SdkCoreAlternateContactlessPaymentDataImpl(oncontextitemselected.AlternateContactlessPaymentDataJson()).iterator();
        while (it.hasNext()) {
            int i = SdkCoreBusinessLogicModuleImpl + 43;
            getCiacDecline = i % 128;
            if (i % 2 != 0) {
                arrayList.add(com.payair.hce.onStartCommand.writeReplace(oncontextitemselected.writeReplace.DigitizedCardProfile(oncontextitemselected.AlternateContactlessPaymentDataJson(), it.next().intValue())));
                throw null;
            }
            arrayList.add(com.payair.hce.onStartCommand.writeReplace(oncontextitemselected.writeReplace.DigitizedCardProfile(oncontextitemselected.AlternateContactlessPaymentDataJson(), it.next().intValue())));
        }
        java.util.Iterator it2 = arrayList.iterator();
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 97) % 128;
        return it2;
    }

    @Override // com.payair.hce.sendRequest
    public final com.payair.hce.getNetworkTokenReference DigitizedCardProfile() {
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 83) % 128;
        com.payair.hce.getNetworkTokenReference writeReplace = this.writeReplace.writeReplace(AlternateContactlessPaymentDataJson());
        if (writeReplace != null) {
            int i = SdkCoreBusinessLogicModuleImpl + 85;
            getCiacDecline = i % 128;
            if (i % 2 == 0) {
                writeReplace.DigitizedCardProfile();
            } else {
                writeReplace.DigitizedCardProfile();
                throw null;
            }
        }
        int i2 = SdkCoreBusinessLogicModuleImpl + 99;
        getCiacDecline = i2 % 128;
        if (i2 % 2 == 0) {
            return writeReplace;
        }
        throw null;
    }

    @Override // com.payair.hce.sendRequest
    public final void valueOf(com.payair.hce.getNetworkTokenReference getnetworktokenreference) {
        int i = SdkCoreBusinessLogicModuleImpl + 61;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            getnetworktokenreference.DigitizedCardProfile();
            this.writeReplace.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson(), getnetworktokenreference);
        } else {
            getnetworktokenreference.DigitizedCardProfile();
            this.writeReplace.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson(), getnetworktokenreference);
            throw null;
        }
    }

    @Override // com.payair.hce.sendRequest
    public final int SdkCoreAlternateContactlessPaymentDataImpl() {
        java.util.Iterator<java.lang.String> it = this.writeReplace.RecordsJson(AlternateContactlessPaymentDataJson()).iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(this.writeReplace.values(AlternateContactlessPaymentDataJson(), it.next())) == com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf) {
                    int i2 = getCiacDecline;
                    SdkCoreBusinessLogicModuleImpl = (i2 + 21) % 128;
                    i++;
                    SdkCoreBusinessLogicModuleImpl = (i2 + 15) % 128;
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        int i3 = getCiacDecline + 79;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // com.payair.hce.getApplicationContext
    public final com.payair.hce.isNetworkError SdkCoreBusinessLogicModuleImpl() {
        synchronized (getProfileVersion) {
            com.payair.hce.isNetworkError isnetworkerror = getCvrMaskAnd;
            if (isnetworkerror != null) {
                return isnetworkerror;
            }
            java.lang.String writeReplace = this.writeReplace.writeReplace(AlternateContactlessPaymentDataJson(), com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf.DigitizedCardProfile());
            if (writeReplace == null) {
                return null;
            }
            com.payair.hce.isNetworkError writeReplace2 = com.payair.hce.getAssets.writeReplace(this.writeReplace.DigitizedCardProfile(AlternateContactlessPaymentDataJson(), writeReplace));
            writeReplace2.getProfileVersion();
            return writeReplace2;
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.onContextItemSelected oncontextitemselected = (com.payair.hce.onContextItemSelected) objArr[0];
        int intValue = ((java.lang.Number) objArr[1]).intValue();
        com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace = (com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace) objArr[2];
        java.lang.String DigitizedCardProfile = com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis()));
        synchronized (getProfileVersion) {
            oncontextitemselected.writeReplace.AlternateContactlessPaymentDataJson(oncontextitemselected.AlternateContactlessPaymentDataJson(), intValue, writereplace.DigitizedCardProfile(), DigitizedCardProfile);
        }
        return null;
    }

    @Override // com.payair.hce.getApplicationContext
    public final void valueOf(com.payair.hce.RequestCompleteTokenizeDtoPresentationType requestCompleteTokenizeDtoPresentationType) throws com.payair.hce.getTokenInfo {
        java.lang.String str;
        if (!AlternateContactlessPaymentDataJson().equals(requestCompleteTokenizeDtoPresentationType.writeReplace())) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{18, 48, 29, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000", true, objArr);
            throw new com.payair.hce.getTokenInfo(((java.lang.String) objArr[0]).intern());
        }
        com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(requestCompleteTokenizeDtoPresentationType.AlternateContactlessPaymentDataJson());
        java.lang.String l = java.lang.Long.toString(java.lang.System.currentTimeMillis());
        com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep = this.writeReplace;
        java.lang.String AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson();
        if (AlternateContactlessPaymentDataJson != null) {
            int i = getCiacDecline + 47;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            if (i % 2 == 0) {
                AlternateContactlessPaymentDataJson.writeReplace();
                throw new java.lang.ArithmeticException();
            }
            str = AlternateContactlessPaymentDataJson.writeReplace();
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 3) % 128;
        } else {
            str = null;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{66, 3, 109, 2}, null, true, objArr2);
        accessgetcoroutinescopep.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2, str, ((java.lang.String) objArr2[0]).intern(), l, com.payair.hce.onStartCommand.writeReplace(requestCompleteTokenizeDtoPresentationType));
    }

    @Override // com.payair.hce.sendRequest
    public final boolean getCvrMaskAnd() {
        int i = getCiacDecline + 95;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            boolean z = this.values.getContactlessPaymentData() != null;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
            if (z) {
                byte[] bArr = new byte[2];
                java.lang.System.arraycopy(this.values.getContactlessPaymentData().getGpoResponse(), 4, bArr, 0, 2);
                if ((bArr[0] & 2) != 2) {
                    return false;
                }
                int i2 = SdkCoreBusinessLogicModuleImpl + 9;
                getCiacDecline = i2 % 128;
                return i2 % 2 == 0;
            }
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 57) % 128;
            return false;
        }
        this.values.getContactlessPaymentData();
        throw null;
    }

    @Override // com.payair.hce.sendRequest
    public final java.lang.String values() {
        int i = getCiacDecline + 119;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.values.getDigitizedCardId()).writeReplace();
        }
        com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(this.values.getDigitizedCardId()).writeReplace();
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getApplicationContext
    public final byte[] AlternateContactlessPaymentDataJson(byte[] bArr) throws com.payair.hce.isSendHeaders {
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 111) % 128;
        if (valueOf() != com.payair.hce.component1.AlternateContactlessPaymentDataJson) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{69, 15, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, objArr);
            com.payair.hce.isSendHeaders issendheaders = new com.payair.hce.isSendHeaders(((java.lang.String) objArr[0]).intern());
            this.valueOf.writeReplace(this, com.payair.hce.replenishToken.DigitizedCardProfile, issendheaders);
            throw issendheaders;
        }
        if (!getCiacDecline()) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{69, 15, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, objArr2);
            com.payair.hce.isSendHeaders issendheaders2 = new com.payair.hce.isSendHeaders(((java.lang.String) objArr2[0]).intern());
            this.valueOf.writeReplace(this, com.payair.hce.replenishToken.DigitizedCardProfile, issendheaders2);
            throw issendheaders2;
        }
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(bArr);
        byte[] DigitizedCardProfile = this.IccPrivateKeyCrtComponentsJson.DigitizedCardProfile(bArr);
        com.payair.hce.stopService.AlternateContactlessPaymentDataJson(DigitizedCardProfile);
        int i = SdkCoreBusinessLogicModuleImpl + 37;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    @Override // com.payair.hce.sendRequest
    public final void getAid() {
        int i = getCiacDecline;
        SdkCoreBusinessLogicModuleImpl = (i + 55) % 128;
        com.payair.hce.ContactlessPaymentData contactlessPaymentData = this.IccPrivateKeyCrtComponentsJson;
        if (contactlessPaymentData != null) {
            int i2 = (i + 39) % 128;
            SdkCoreBusinessLogicModuleImpl = i2;
            getCiacDecline = (i2 + 81) % 128;
            contactlessPaymentData.AlternateContactlessPaymentDataJson();
        }
        this.valueOf.DigitizedCardProfile();
        getGpoResponse();
    }

    @Override // com.payair.hce.getApplicationContext
    public final void getDualTapResetTimeout() {
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 71) % 128;
        if (this.AlternateContactlessPaymentDataJson.values().AlternateContactlessPaymentDataJson(this)) {
            IccPrivateKeyCrtComponentsJson();
        }
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 33) % 128;
    }

    @Override // com.payair.hce.sendRequest
    public final com.payair.hce.gotDeleteData DigitizedCardProfile(com.payair.hce.setStatusCode setstatuscode) {
        if (this.values.getVersion() == com.payair.hce.getStatusCodeFromServer.AlternateContactlessPaymentDataJson) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 93) % 128;
            com.payair.hce.gotDeleteData gotdeletedata = com.payair.hce.gotDeleteData.valueOf;
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 81) % 128;
            return gotdeletedata;
        }
        boolean z = true;
        if (setstatuscode == com.payair.hce.setStatusCode.writeReplace) {
            int i = getCiacDecline + 11;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            if (i % 2 == 0) {
                this.values.getContactlessPaymentData();
                throw new java.lang.ArithmeticException();
            }
            boolean z2 = this.values.getContactlessPaymentData() != null;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z2)};
            if (z2) {
                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 105) % 128;
                return this.values.getContactlessPaymentData().getCvmModel();
            }
        }
        if (setstatuscode == com.payair.hce.setStatusCode.valueOf) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 101) % 128;
            if (this.values.getDsrpData() != null) {
                getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 43) % 128;
            } else {
                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 29) % 128;
                z = false;
            }
            new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
            if (z) {
                return this.values.getDsrpData().getCvmModel();
            }
        }
        if (setstatuscode != com.payair.hce.setStatusCode.DigitizedCardProfile || !getCvmResetTimeout()) {
            return com.payair.hce.gotDeleteData.values;
        }
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 39) % 128;
        return com.payair.hce.gotDeleteData.valueOf;
    }

    @Override // com.payair.hce.sendRequest
    public final com.payair.hce.setOrderRef getPaymentFci() {
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 109) % 128;
        com.payair.hce.setOrderRef cardholderValidator = this.values.getWalletData().getCardholderValidator();
        int i = SdkCoreBusinessLogicModuleImpl + 89;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            return cardholderValidator;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onContextItemSelected oncontextitemselected = (com.payair.hce.onContextItemSelected) objArr[0];
        int i = getCiacDecline + 101;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 != 0) {
            return oncontextitemselected.values.getVersion();
        }
        oncontextitemselected.values.getVersion();
        throw null;
    }

    @Override // com.payair.hce.sendRequest
    public final void getGpoResponse() {
        synchronized (getProfileVersion) {
            com.payair.hce.isNetworkError isnetworkerror = getCvrMaskAnd;
            if (isnetworkerror != null) {
                isnetworkerror.getGpoResponse();
            }
            getCvrMaskAnd = null;
        }
    }

    @Override // com.payair.hce.getApplicationContext
    public final void getSecurityWord() {
        new com.payair.hce.onContextItemSelected.valueOf().start();
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 71) % 128;
    }

    class valueOf extends android.os.HandlerThread {
        private static int DigitizedCardProfile = 0;
        private static int valueOf = 1;

        valueOf() {
            super(com.payair.hce.onContextItemSelected.valueOf.class.getSimpleName(), 10);
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            DigitizedCardProfile = (valueOf + 101) % 128;
            java.lang.Thread.yield();
            com.payair.hce.onContextItemSelected.AlternateContactlessPaymentDataJson(com.payair.hce.onContextItemSelected.this.SdkCoreBusinessLogicModuleImpl());
            quitSafely();
            int i = DigitizedCardProfile;
            int i2 = i & 49;
            int i3 = i | 49;
            valueOf = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
    @Override // com.payair.hce.sendRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getCiacDecline() {
        boolean z;
        if (this.IccPrivateKeyCrtComponentsJson != null) {
            int i = (getCiacDecline + 121) % 128;
            SdkCoreBusinessLogicModuleImpl = i;
            int i2 = i + 55;
            getCiacDecline = i2 % 128;
            if (i2 % 2 == 0) {
                if (this.values.getContactlessPaymentData() != null) {
                    int i3 = getCiacDecline + 3;
                    SdkCoreBusinessLogicModuleImpl = i3 % 128;
                    if (i3 % 2 != 0) {
                        z = true;
                        new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
                        if (z) {
                            return true;
                        }
                    }
                }
                z = false;
                new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
                if (z) {
                }
            } else {
                this.values.getContactlessPaymentData();
                throw null;
            }
        }
        int i4 = SdkCoreBusinessLogicModuleImpl + 25;
        getCiacDecline = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    private boolean getCvmResetTimeout() {
        if (this.IccPrivateKeyCrtComponentsJson != null) {
            boolean z = this.values.getContactlessPaymentData() != null;
            new java.lang.Object[]{java.lang.Boolean.valueOf(z)};
            if (z) {
                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 59) % 128;
                return true;
            }
        } else {
            int i = SdkCoreBusinessLogicModuleImpl + 71;
            getCiacDecline = i % 128;
            int i2 = i % 2;
        }
        return false;
    }

    static void getCardLayoutDescription() {
        getPaymentFci = new char[]{16854, 16784, 16784, 16779, 16793, 16789, 16827, 16702, 16675, 16682, 16854, 16884, 16880, 16881, 16648, 16667, 16646, 16666, 16780, 16710, 16820, 16820, 16709, 16711, 16709, 16710, 16817, 16713, 16707, 16714, 16712, 16718, 16793, 16814, 16713, 16810, 16785, 16829, 16799, 16785, 16710, 16712, 16801, 16768, 16815, 16716, 16710, 16713, 16714, 16813, 16809, 16704, 16709, 16810, 16808, 16711, 16713, 16712, 16785, 16785, 16829, 16799, 16785, 16710, 16712, 16801, 16725, 16721, 16723, 16801, 16681, 16679, 16678, 16683, 16658, 16756, 16650, 16677, 16678, 16655, 16754, 16683, 16685, 16642};
    }

    private com.payair.hce.getStatusCodeFromServer getApplicationLifeCycleData() {
        return (com.payair.hce.getStatusCodeFromServer) valueOf(new java.lang.Object[]{this}, -415876941, 415876943, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getApplicationContext
    public final void writeReplace(int i, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace) {
        valueOf(new java.lang.Object[]{this, java.lang.Integer.valueOf(i), writereplace}, -344890857, 344890861, i);
    }

    @Override // com.payair.hce.sendRequest
    public final java.util.Iterator<com.payair.hce.RequestCompleteTokenizeDtoPresentationType> RecordsJson() {
        return (java.util.Iterator) valueOf(new java.lang.Object[]{this}, -1722130955, 1722130955, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.sendRequest
    public final java.lang.String writeReplace() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1898791993, -1898791990, java.lang.System.identityHashCode(this));
    }

    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> DigitizedCardProfile(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        return (java.util.List) valueOf(new java.lang.Object[]{this, list}, -1942070843, 1942070844, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
    }
}
