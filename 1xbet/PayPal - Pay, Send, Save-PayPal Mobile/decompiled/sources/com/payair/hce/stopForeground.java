package com.payair.hce;

/* loaded from: classes4.dex */
public final class stopForeground implements com.payair.hce.getParams {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long SdkCoreContactlessPaymentDataImpl;
    private static char buildRecords;
    private static int getCdol1RelatedDataLength;
    private static int getIccPrivateKeyCrtComponents;
    private static int getIssuerApplicationData;
    private final com.payair.hce.getResources AlternateContactlessPaymentDataJson;
    private com.payair.hce.accessgetCoroutineScopep DigitizedCardProfile;
    private com.payair.hce.getDrawable IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.getColor RecordsJson;
    private com.payair.hce.useDemoMode SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.setSpecialRequestUrl SdkCoreBusinessLogicModuleImpl;
    private byte[] SdkCoreCardRiskManagementDataImpl;
    private com.payair.hce.getOpPackageName getAdditionalCheckTable;
    private com.payair.hce.getApplicationInfo getAid;
    private com.payair.hce.updateRNSInformation getApplicationLifeCycleData;
    private com.payair.hce.copydefault getCardholderValidators;
    private com.payair.hce.setSendHeaders getCiacDecline;
    private com.payair.hce.obtainStyledAttributes getCrmCountryCode;
    private com.payair.hce.getErrors getDualTapResetTimeout;
    private com.payair.hce.getErrors getMagstripeCvmIssuerOptions;
    private com.payair.hce.getStatusMessage getMchipCvmIssuerOptions;
    private com.payair.hce.getPackageName getPaymentFci;
    private boolean getPpseFci;
    private com.payair.hce.setUpMCBP getProfileVersion;
    private com.payair.hce.getClassLoader getSecurityWord;
    private com.payair.hce.hashCode valueOf;
    private com.payair.hce.VisaRepersoInitializer values;
    private com.payair.hce.setErrors writeReplace;
    private boolean getGpoResponse = true;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getCvmResetTimeout = null;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getCardLayoutDescription = null;
    private com.payair.hce.stopSelfResult getCvrMaskAnd = new com.payair.hce.stopSelfResult();

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        int i8 = i | i7;
        int i9 = (i * 569) + (i2 * 569) + (((~i6) | (~(i4 | i7)) | (~(i5 | i7))) * (-1136)) + (((~(i4 | i3)) | (~(i5 | i3)) | (~(i8 | i2))) * (-568)) + (((~(i2 | i7)) | (~i8) | (~(i3 | i6))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION);
        return i9 != 1 ? i9 != 2 ? writeReplace(objArr) : values(objArr) : valueOf(objArr);
    }

    private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = 718 - s;
        int i3 = 42 - i;
        char[] cArr = new char[b + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (b + i3) - 2;
            i3 = i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            cArr[i5] = (char) i2;
            int i6 = i3 + 1;
            if (i5 == b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                i2 = (i2 + bArr[i6]) - 2;
                i3 = i6;
                i4 = i5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = 3 - (s2 * 4);
        byte[] bArr = $$d;
        int i3 = 106 - s;
        int i4 = b * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i3 += -i5;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i2];
            i3 += -i5;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            i2++;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    stopForeground(com.payair.hce.getResources getresources) {
        this.AlternateContactlessPaymentDataJson = getresources;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams DigitizedCardProfile(com.payair.hce.VisaRepersoInitializer visaRepersoInitializer) {
        int i = getIccPrivateKeyCrtComponents;
        int i2 = i + 45;
        getIssuerApplicationData = i2 % 128;
        if (i2 % 2 == 0) {
            this.values = visaRepersoInitializer;
            getIssuerApplicationData = (i + 103) % 128;
            return this;
        }
        this.values = visaRepersoInitializer;
        throw null;
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        $10 = ($11 + 5) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            cArr = str2.toCharArray();
            $10 = ($11 + 95) % 128;
        } else {
            cArr = str2;
        }
        char[] cArr2 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1178 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((byte) 0, length4, (byte) (length4 - 4), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 3443 - android.text.TextUtils.getOffsetBefore("", 0), (char) (3831 - android.text.TextUtils.indexOf("", "")))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 27, 1864 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (41775 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    c((byte) 0, (short) 1, (short) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3132, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c((byte) 0, (short) 0, (short) 0, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ cArr2[getwalletdata.writeReplace]) ^ (SdkCoreContactlessPaymentDataImpl ^ 1263759066225628708L)) ^ ((int) (getCdol1RelatedDataLength ^ 1263759066225628708L))) ^ ((char) (buildRecords ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr5);
        int i2 = $11 + 37;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams AlternateContactlessPaymentDataJson(com.payair.hce.setErrors seterrors) {
        int i = (getIssuerApplicationData + 43) % 128;
        getIccPrivateKeyCrtComponents = i;
        this.writeReplace = seterrors;
        getIssuerApplicationData = (i + 85) % 128;
        return this;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams DigitizedCardProfile(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = getIssuerApplicationData;
        getIccPrivateKeyCrtComponents = (i + 97) % 128;
        this.getCvmResetTimeout = list;
        getIccPrivateKeyCrtComponents = (i + 15) % 128;
        return this;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams AlternateContactlessPaymentDataJson(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = (getIccPrivateKeyCrtComponents + 9) % 128;
        getIssuerApplicationData = i;
        this.getCardLayoutDescription = list;
        int i2 = i + 75;
        getIccPrivateKeyCrtComponents = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams writeReplace(com.payair.hce.getColor getcolor) {
        int i = (getIccPrivateKeyCrtComponents + 29) % 128;
        getIssuerApplicationData = i;
        this.RecordsJson = getcolor;
        int i2 = i + 51;
        getIccPrivateKeyCrtComponents = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams writeReplace(com.payair.hce.getDrawable getdrawable) {
        int i = getIccPrivateKeyCrtComponents + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getIssuerApplicationData = i % 128;
        if (i % 2 == 0) {
            this.IccPrivateKeyCrtComponentsJson = getdrawable;
            return this;
        }
        this.IccPrivateKeyCrtComponentsJson = getdrawable;
        throw null;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams valueOf(com.payair.hce.getApplicationInfo getapplicationinfo) {
        int i = (getIccPrivateKeyCrtComponents + 71) % 128;
        getIssuerApplicationData = i;
        this.getAid = getapplicationinfo;
        getIccPrivateKeyCrtComponents = (i + 75) % 128;
        return this;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams values(com.payair.hce.useDemoMode usedemomode) {
        int i = getIssuerApplicationData;
        getIccPrivateKeyCrtComponents = (i + 59) % 128;
        this.SdkCoreAlternateContactlessPaymentDataImpl = usedemomode;
        getIccPrivateKeyCrtComponents = (i + 37) % 128;
        return this;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.stopForeground stopforeground = (com.payair.hce.stopForeground) objArr[0];
        com.payair.hce.getClassLoader getclassloader = (com.payair.hce.getClassLoader) objArr[1];
        int i = getIccPrivateKeyCrtComponents;
        getIssuerApplicationData = (i + 63) % 128;
        stopforeground.getSecurityWord = getclassloader;
        int i2 = i + 19;
        getIssuerApplicationData = i2 % 128;
        if (i2 % 2 == 0) {
            return stopforeground;
        }
        throw null;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams values(com.payair.hce.updateRNSInformation updaternsinformation) {
        int i = getIccPrivateKeyCrtComponents;
        getIssuerApplicationData = (i + 25) % 128;
        this.getApplicationLifeCycleData = updaternsinformation;
        int i2 = i + 101;
        getIssuerApplicationData = i2 % 128;
        if (i2 % 2 == 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams AlternateContactlessPaymentDataJson(com.payair.hce.setStatusCodeFromServer setstatuscodefromserver) {
        int i = getIssuerApplicationData + 5;
        getIccPrivateKeyCrtComponents = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[]{setstatuscodefromserver}, 1779101737, -1779101736, (int) java.lang.System.currentTimeMillis());
            return this;
        }
        com.payair.hce.checkSelfPermission.writeReplace(new java.lang.Object[]{setstatuscodefromserver}, 1779101737, -1779101736, (int) java.lang.System.currentTimeMillis());
        throw null;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams writeReplace(com.payair.hce.setUpMCBP setupmcbp) {
        int i = getIccPrivateKeyCrtComponents + 111;
        getIssuerApplicationData = i % 128;
        if (i % 2 == 0) {
            this.getProfileVersion = setupmcbp;
            return this;
        }
        this.getProfileVersion = setupmcbp;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams DigitizedCardProfile(com.payair.hce.hashCode hashcode) {
        int i = getIccPrivateKeyCrtComponents;
        int i2 = i + 5;
        getIssuerApplicationData = i2 % 128;
        if (i2 % 2 == 0) {
            this.valueOf = hashcode;
            getIssuerApplicationData = (i + 47) % 128;
            return this;
        }
        this.valueOf = hashcode;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams DigitizedCardProfile(com.payair.hce.getPackageName getpackagename) {
        int i = getIssuerApplicationData;
        getIccPrivateKeyCrtComponents = (i + 93) % 128;
        this.getPaymentFci = getpackagename;
        getIccPrivateKeyCrtComponents = (i + 27) % 128;
        return this;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams valueOf(com.payair.hce.setSpecialRequestUrl setspecialrequesturl) {
        int i = getIssuerApplicationData;
        getIccPrivateKeyCrtComponents = (i + 55) % 128;
        this.SdkCoreBusinessLogicModuleImpl = setspecialrequesturl;
        getIccPrivateKeyCrtComponents = (i + 15) % 128;
        return this;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.stopForeground stopforeground = (com.payair.hce.stopForeground) objArr[0];
        if (stopforeground.IccPrivateKeyCrtComponentsJson != null) {
            int i = (getIssuerApplicationData + 1) % 128;
            getIccPrivateKeyCrtComponents = i;
            if (stopforeground.getProfileVersion != null && stopforeground.valueOf != null) {
                int i2 = i + 105;
                getIssuerApplicationData = i2 % 128;
                if (i2 % 2 != 0) {
                    com.payair.hce.getPackageName getpackagename = stopforeground.getPaymentFci;
                    throw null;
                }
                if (stopforeground.getPaymentFci != null && stopforeground.SdkCoreBusinessLogicModuleImpl != null && stopforeground.getAid != null && stopforeground.getSecurityWord != null && stopforeground.getApplicationLifeCycleData != null && stopforeground.writeReplace != null) {
                    if (stopforeground.SdkCoreAlternateContactlessPaymentDataImpl == null) {
                        stopforeground.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.dump();
                    }
                    if (stopforeground.DigitizedCardProfile == null) {
                        com.payair.hce.startForeground startforeground = new com.payair.hce.startForeground(stopforeground.writeReplace.valueOf(), stopforeground.SdkCoreCardRiskManagementDataImpl);
                        com.payair.hce.getAll getall = new com.payair.hce.getAll();
                        stopforeground.DigitizedCardProfile = getall;
                        getall.writeReplace(stopforeground.writeReplace.AlternateContactlessPaymentDataJson()).writeReplace(10).valueOf(startforeground).writeReplace(stopforeground.getMchipCvmIssuerOptions).AlternateContactlessPaymentDataJson(stopforeground.AlternateContactlessPaymentDataJson.values());
                    }
                    if (stopforeground.getCiacDecline == null) {
                        stopforeground.getCiacDecline = new com.payair.hce.unregisterForContextMenu();
                    }
                    if (stopforeground.RecordsJson == null) {
                        stopforeground.RecordsJson = new com.payair.hce.VisaTokenizationInitializer();
                    }
                    if (stopforeground.getCardholderValidators == null) {
                        stopforeground.getCardholderValidators = new com.payair.hce.onUnbind();
                    }
                    int writeReplace = stopforeground.getCardholderValidators.writeReplace();
                    if (!((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(writeReplace), stopforeground.getCardholderValidators.DigitizedCardProfile()}, -694650401, 694650402, writeReplace)).booleanValue()) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (stopforeground.getAdditionalCheckTable == null) {
                        stopforeground.getAdditionalCheckTable = new com.payair.hce.getOpPackageName() { // from class: com.payair.hce.stopForeground.1
                            private static int AlternateContactlessPaymentDataJson = 1;
                            private static int valueOf;

                            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr2, int i3, int i4, int i5) {
                                int i6 = ~i4;
                                int i7 = ~i5;
                                int i8 = (i3 * lib.android.paypal.com.magnessdk.g.e) + (i4 * 407) + (((~(i6 | i5)) | (~(i7 | i3 | i4))) * (-406)) + ((~(i6 | i7 | i3)) * (-406)) + (((~((~i3) | i5)) | (~(i4 | i7))) * 406);
                                if (i8 == 1) {
                                    return DigitizedCardProfile(objArr2);
                                }
                                if (i8 == 2) {
                                    return AlternateContactlessPaymentDataJson(objArr2);
                                }
                                if (i8 == 3) {
                                    return values(objArr2);
                                }
                                int i9 = AlternateContactlessPaymentDataJson;
                                int i10 = i9 ^ 95;
                                int i11 = ((((i9 & 95) | i10) << 1) - i10) % 128;
                                valueOf = i11;
                                AlternateContactlessPaymentDataJson = (((i11 & 42) + (i11 | 42)) - 1) % 128;
                                return java.lang.Boolean.TRUE;
                            }

                            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2) {
                                int i3 = AlternateContactlessPaymentDataJson;
                                int i4 = i3 | 97;
                                int i5 = i4 << 1;
                                int i6 = -((~(i3 & 97)) & i4);
                                valueOf = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
                                com.payair.hce.isLocallyVerified islocallyverified = com.payair.hce.isLocallyVerified.writeReplace;
                                int i7 = valueOf;
                                int i8 = ((i7 | 49) << 1) - (i7 ^ 49);
                                AlternateContactlessPaymentDataJson = i8 % 128;
                                if (i8 % 2 != 0) {
                                    return islocallyverified;
                                }
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                                int i3 = valueOf + 11;
                                AlternateContactlessPaymentDataJson = i3 % 128;
                                if (i3 % 2 == 0) {
                                    com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys = com.payair.hce.checkDeviceUnlockKeys.values;
                                    throw null;
                                }
                                com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys2 = com.payair.hce.checkDeviceUnlockKeys.values;
                                int i4 = AlternateContactlessPaymentDataJson;
                                int i5 = ((i4 | 45) << 1) - (i4 ^ 45);
                                valueOf = i5 % 128;
                                if (i5 % 2 == 0) {
                                    return checkdeviceunlockkeys2;
                                }
                                throw null;
                            }

                            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                                int i3 = AlternateContactlessPaymentDataJson;
                                int i4 = (((i3 & (-122)) | ((~i3) & 121)) - (~(-(-((i3 & 121) << 1))))) - 1;
                                valueOf = i4 % 128;
                                if (i4 % 2 != 0) {
                                    com.payair.hce.getSelectedCard getselectedcard = com.payair.hce.getSelectedCard.AlternateContactlessPaymentDataJson;
                                    throw null;
                                }
                                com.payair.hce.getSelectedCard getselectedcard2 = com.payair.hce.getSelectedCard.AlternateContactlessPaymentDataJson;
                                int i5 = AlternateContactlessPaymentDataJson;
                                int i6 = ((i5 | 29) << 1) - (i5 ^ 29);
                                valueOf = i6 % 128;
                                if (i6 % 2 == 0) {
                                    return getselectedcard2;
                                }
                                throw null;
                            }

                            @Override // com.payair.hce.getOpPackageName
                            public final boolean values() {
                                return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, -936216053, 936216053, java.lang.System.identityHashCode(this))).booleanValue();
                            }

                            @Override // com.payair.hce.getOpPackageName
                            public final com.payair.hce.getSelectedCard DigitizedCardProfile() {
                                return (com.payair.hce.getSelectedCard) writeReplace(new java.lang.Object[]{this}, 1621942901, -1621942898, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.getOpPackageName
                            public final com.payair.hce.checkDeviceUnlockKeys valueOf() {
                                return (com.payair.hce.checkDeviceUnlockKeys) writeReplace(new java.lang.Object[]{this}, 2025997966, -2025997965, java.lang.System.identityHashCode(this));
                            }

                            @Override // com.payair.hce.getOpPackageName
                            public final com.payair.hce.isLocallyVerified AlternateContactlessPaymentDataJson() {
                                return (com.payair.hce.isLocallyVerified) writeReplace(new java.lang.Object[]{this}, -867915018, 867915020, java.lang.System.identityHashCode(this));
                            }
                        };
                    }
                    if (stopforeground.getAdditionalCheckTable.AlternateContactlessPaymentDataJson() != null && stopforeground.getAdditionalCheckTable.valueOf() != null) {
                        int i3 = getIssuerApplicationData + 37;
                        getIccPrivateKeyCrtComponents = i3 % 128;
                        if (i3 % 2 == 0) {
                            stopforeground.getAdditionalCheckTable.DigitizedCardProfile();
                            throw null;
                        }
                        if (stopforeground.getAdditionalCheckTable.DigitizedCardProfile() != null) {
                            if (stopforeground.getCrmCountryCode == null) {
                                stopforeground.getCrmCountryCode = new com.payair.hce.onRebind();
                            }
                            if (stopforeground.values == null) {
                                stopforeground.values = new com.payair.hce.startIntentSender();
                                getIccPrivateKeyCrtComponents = (getIssuerApplicationData + 41) % 128;
                            }
                            stopforeground.values.initialize(stopforeground.writeReplace.values(), stopforeground.valueOf, stopforeground.getCvrMaskAnd, new com.payair.hce.getPackageManager(stopforeground.DigitizedCardProfile), stopforeground.getApplicationLifeCycleData, stopforeground.getCardholderValidators);
                            com.payair.hce.getMainLooper getmainlooper = new com.payair.hce.getMainLooper(stopforeground.getProfileVersion, stopforeground.writeReplace.DigitizedCardProfile(), stopforeground.DigitizedCardProfile, stopforeground.SdkCoreAlternateContactlessPaymentDataImpl, stopforeground.values, stopforeground.IccPrivateKeyCrtComponentsJson, stopforeground.getAid, stopforeground.getGpoResponse, stopforeground.getCiacDecline, stopforeground.getPaymentFci, stopforeground.getCardLayoutDescription, stopforeground.getCvmResetTimeout, stopforeground.getMagstripeCvmIssuerOptions, stopforeground.getAdditionalCheckTable, stopforeground.getCrmCountryCode, stopforeground.getPpseFci);
                            stopforeground.getCvrMaskAnd.AlternateContactlessPaymentDataJson(getmainlooper);
                            com.payair.hce.stopSelf stopself = new com.payair.hce.stopSelf(stopforeground.SdkCoreBusinessLogicModuleImpl, stopforeground.RecordsJson, getmainlooper);
                            com.payair.hce.onTaskRemoved ontaskremoved = new com.payair.hce.onTaskRemoved(stopforeground.DigitizedCardProfile, new com.payair.hce.registerComponentCallbacks(stopforeground.getSecurityWord, getmainlooper), stopforeground.writeReplace, stopforeground.getApplicationLifeCycleData, stopforeground.getDualTapResetTimeout);
                            com.payair.hce.revokeUriPermission.values(com.payair.hce.grantUriPermission.DigitizedCardProfile);
                            return new com.payair.hce.onBind(getmainlooper, stopforeground.values, stopforeground.DigitizedCardProfile, stopself, ontaskremoved);
                        }
                    }
                    throw new java.lang.IllegalArgumentException();
                }
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        if (iArr == null) {
            return bool;
        }
        for (int i : iArr) {
            int i2 = getIccPrivateKeyCrtComponents;
            getIssuerApplicationData = (i2 + 11) % 128;
            if (i > 0) {
                int i3 = i2 + 69;
                getIssuerApplicationData = i3 % 128;
                if (i3 % 2 != 0) {
                    if (i <= 97) {
                    }
                } else if (i <= 60) {
                }
            }
            return bool;
        }
        if (intValue > 0 && intValue <= 5) {
            int i4 = getIssuerApplicationData + 99;
            getIccPrivateKeyCrtComponents = i4 % 128;
            int length = iArr.length;
            if (i4 % 2 == 0) {
                throw null;
            }
            if (intValue == length) {
                return java.lang.Boolean.TRUE;
            }
        }
        return bool;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getIssuerApplicationData = 0;
        getIccPrivateKeyCrtComponents = 1;
        SdkCoreContactlessPaymentDataImpl = -4883789958133210293L;
        getCdol1RelatedDataLength = -804334044;
        buildRecords = (char) 54820;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x03f0, code lost:
    
        if (r0.contains(r6.getField((java.lang.String) r13[0]).get(null)) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x06c4, code lost:
    
        if (r0 != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        int i3 = (getIssuerApplicationData + 13) % 128;
        getIccPrivateKeyCrtComponents = i3;
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i4 = ~i;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i4 | 62178748)) | (-1069467070) | (~(i4 | 1067107733))) * 464) + 1007846520 + (((-1007288322) | i) * (-464)) + (((~(i | 1067107733)) | (-1069467070)) * 464))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 50, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a((short) 653, (byte) 34, 39, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            getIssuerApplicationData = (i3 + 99) % 128;
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("畯䏗賄궰", "ᬇ鹡ᓬ팴\uef0f붷ꅿ鎝熘䵓땻\uf269稠뾍鹣д汊ર臩屢ﴎ쒵欷", "皇\uda4c㪱䊔", (-1311093642) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("畯䏗賄궰", "Ｂ益铅ř£\ued7e㞢\ud9d4㙊궖鑍樫ƹ煮野⮢꿟舼", "驗垄筥\uf7e6", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, (char) (59003 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("畯䏗賄궰", "댽쮢㆟㧼꿿啎璖㲅鵢\ue879릨穇䓅ᐴ⍊㇜컇鴠ᥟ궀䪞úﬖ᭺啃厇꣐\uf2a4㚣\ud834걩꾩ミ\ue9d3", "ꛫ㿢潽㇙", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) android.view.View.MeasureSpec.getMode(0), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("畯䏗賄궰", "녮ﭧⱢ瞭뱑", "\uf436溜ꎾ뛱", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 1090925580, (char) (61859 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    getIccPrivateKeyCrtComponents = (getIssuerApplicationData + 93) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    int i5 = ~i;
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i5 | (-532744165))) | 469764068 | (~((-472184821) | i5))) * (-1136)) + 573941528 + (((~(i | (-472184821))) | (~((-532744165) | i)) | (~(535164916 | i5))) * (-568)) + (((~(i5 | 532744164)) | (~(472184820 | i5)) | (~((-469764069) | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 2713 - android.text.TextUtils.getTrimmedLength(""), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        a((short) 653, (byte) 34, 39, objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i6 = ~i;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((588382168 | i) * 614) - 768234712) + (((~((-259690953) | i6)) | 51417544 | (~(745238032 | i6))) * (-1228)) + (((~(i6 | (-208273409))) | (~(796655576 | i6))) * 614))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) android.graphics.Color.argb(0, 0, 0, 0));
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a((short) 653, (byte) 34, 39, objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 34, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1738, (char) (5826 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    a((short) 653, (byte) 34, 39, objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 33, android.text.TextUtils.getOffsetAfter("", 0) + 1738, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5826));
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                a((short) 653, (byte) 34, 39, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    int i7 = getIssuerApplicationData + 95;
                    getIccPrivateKeyCrtComponents = i7 % 128;
                    if (i7 % 2 == 0) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 1738 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5825));
                        byte b = (byte) (-$$a[20]);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a((short) 600, b, b, objArr15);
                        set.contains(cls8.getField((java.lang.String) objArr15[0]).get(null));
                        throw new java.lang.ArithmeticException();
                    }
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.os.Process.myPid() >> 22), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1739, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 5826));
                    byte b2 = (byte) (-$$a[20]);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a((short) 600, b2, b2, objArr16);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i8 = ~i;
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-798375531) | i)) | (~(206553454 | i8))) * (-1808)) - 858826312) + (((~((-201719915) | i)) | (~(803209070 | i8))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i | (-206553455))) | 596655616 | (~(i8 | 798375530))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 50, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        a((short) 653, (byte) 34, 39, objArr19);
                        obj5 = cls10.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr17[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                if (android.os.Build.VERSION.SDK_INT > 33) {
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    b("畯䏗賄궰", "ᳮ䀠镄뫢됵✾郝\uf2b9\uf4f0鬞ᲀꚴ奮\u2cf8玴\ueb2e\uf02e좔涸㇡傱ਮﺀ㗼\uf894\ue3b7嬁階", "嬻纁ቆ嚉", android.text.TextUtils.getCapsMode("", 0, 0), (char) (35090 - android.view.View.resolveSize(0, 0)), objArr20);
                    try {
                        java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                        if (obj6 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 36, 3161 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (33099 - android.view.KeyEvent.keyCodeFromString("")));
                            short s = (short) ($$a[14] - 1);
                            byte b3 = (byte) s;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            a(s, b3, b3, objArr22);
                            obj6 = cls11.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                        }
                        long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr21)).longValue();
                        long j = ~longValue;
                        long j2 = i;
                        long j3 = ~(j | j2);
                        long j4 = (((((longValue * 246) + 104975066164L) + (((~((~j2) | j)) | (~(j | (-430225681)))) * (-245))) + ((-245) * j3)) + (((-430225681) | j3) * 245)) - 907442427;
                        if (((((int) (j4 >> 32)) & ((((((~((-1236577668) | (~i))) | 162834435) * 446) + 384374654) + (((~((-1073743233) | i)) | 37814308) * 446)) - 390286022)) | (((((((~(r2 | 530222735)) | 537215248) | (~((-907003675) | r2))) * 464) - 169922971) + ((1067437983 | i) * (-464)) + (((~((-907003675) | i)) | 537215248) * 464)) & ((int) j4))) == 1) {
                            getIccPrivateKeyCrtComponents = (getIssuerApplicationData + 87) % 128;
                            getIccPrivateKeyCrtComponents = (getIssuerApplicationData + 5) % 128;
                            java.lang.Object[] objArr23 = {new int[]{i}, new int[]{i ^ 10}, null, new int[1]};
                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~(561700910 | r2)) | 443228074) * (-328)) - 1244746936) + ((443228074 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(i | (-561700911))) | 6946858 | (~((~i) | 997982126))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj7 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.graphics.Color.red(0));
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a((short) 653, (byte) 34, 39, objArr25);
                                obj7 = cls12.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                            }
                            ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr24)).intValue();
                            return objArr23;
                        }
                        java.lang.Object[] objArr26 = {new int[]{i}, new int[]{i}, null, new int[1]};
                        int i9 = ~i;
                        java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-915265516) | i)) | (~(937293807 | i9))) * (-406)) + 1191910572 + ((~((-847630339) | i9)) * (-406)) + (((~(i | (-89663470))) | (~(i9 | 915265515))) * 406))};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj8 == null) {
                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) android.graphics.Color.alpha(0));
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a((short) 653, (byte) 34, 39, objArr28);
                            obj8 = cls13.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                        }
                        ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
                        return objArr26;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                b("畯䏗賄궰", "\ud910⪞糧ݜ蘃േ\ue6c9\uf36c莦ᛢ䪓\ue3fb藨", "\ue75f渣\ue0aa園", android.view.View.MeasureSpec.getMode(0) - 1435622425, (char) (4832 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr29);
                try {
                    java.lang.Object[] objArr30 = {((java.lang.String) objArr29[0]).intern()};
                    java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj9 == null) {
                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1921 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                        short s2 = (short) ($$a[14] - 1);
                        byte b4 = (byte) s2;
                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                        a(s2, b4, b4, objArr31);
                        obj9 = cls14.getMethod((java.lang.String) objArr31[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj9);
                    }
                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr30);
                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                    b("畯䏗賄궰", "떖", "햄慸违锢", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) - 580814635, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 8847), objArr32);
                    boolean equals = invoke2.equals(((java.lang.String) objArr32[0]).intern());
                    getIccPrivateKeyCrtComponents = (getIssuerApplicationData + 17) % 128;
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
    }

    private static boolean AlternateContactlessPaymentDataJson(int i, int[] iArr) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i), iArr}, -694650401, 694650402, i)).booleanValue();
    }

    static void init$1() {
        $$d = new byte[]{78, 115, -79, 115};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.setTheme valueOf() {
        return (com.payair.hce.setTheme) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 531299899, -531299899, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 215;
    }

    @Override // com.payair.hce.getParams
    public final com.payair.hce.getParams writeReplace(com.payair.hce.getClassLoader getclassloader) {
        return (com.payair.hce.getParams) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, getclassloader}, 1023518068, -1023518066, java.lang.System.identityHashCode(this));
    }
}
