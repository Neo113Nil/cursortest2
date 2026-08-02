package com.payair.hce;

/* loaded from: classes4.dex */
public class getMainLooper implements com.payair.hce.ExpirationDate, com.payair.hce.gotPostData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getPaymentFci;
    private final com.payair.hce.VisaRepersoInitializer AlternateContactlessPaymentDataJson;
    private final com.payair.hce.getDrawable DigitizedCardProfile;
    private boolean IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.setSendHeaders getAid;
    private com.payair.hce.checkPermission getProfileVersion;
    private final com.payair.hce.onConfigurationChanged valueOf;
    private final com.payair.hce.accessgetCoroutineScopep values;
    private final boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = i * 3;
        int i5 = 3 - (i2 * 4);
        int i6 = 119 - (s * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i5;
            int i10 = 0;
            int i11 = (-i5) + i8;
            i3 = i10;
            int i12 = i9;
            i6 = i11;
            i5 = i12;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i5 + 1;
            int i14 = i6;
            i9 = i13;
            i5 = bArr[i13];
            i10 = i3 + 1;
            i8 = i14;
            int i112 = (-i5) + i8;
            i3 = i10;
            int i122 = i9;
            i6 = i112;
            i5 = i122;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        switch ((i * 71) + (i2 * (-69)) + (((~(i2 | i3)) | i4) * (-140)) + ((~(i | i2 | i3)) * 70) + (((~(i | (~i2))) | i4 | (~(i3 | i))) * 70)) {
            case 1:
                return valueOf(objArr);
            case 2:
                com.payair.hce.getMainLooper getmainlooper = (com.payair.hce.getMainLooper) objArr[0];
                java.lang.String str = (java.lang.String) objArr[1];
                RecordsJson = (getPaymentFci + 119) % 128;
                getmainlooper.values.getProfileVersion(str);
                getmainlooper.values.IccPrivateKeyCrtComponentsJson(str);
                getmainlooper.values.valueOf(str);
                getmainlooper.DigitizedCardProfile.AlternateContactlessPaymentDataJson(str);
                getPaymentFci = (RecordsJson + 93) % 128;
                return null;
            case 3:
                return writeReplace(objArr);
            case 4:
                return values(objArr);
            case 5:
                return DigitizedCardProfile(objArr);
            case 6:
                com.payair.hce.getMainLooper getmainlooper2 = (com.payair.hce.getMainLooper) objArr[0];
                com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) objArr[1];
                RecordsJson = (getPaymentFci + 15) % 128;
                sendrequest.AlternateContactlessPaymentDataJson();
                boolean z = getmainlooper2.IccPrivateKeyCrtComponentsJson;
                getmainlooper2.values.valueOf(sendrequest.AlternateContactlessPaymentDataJson(), com.payair.hce.component1.valueOf.AlternateContactlessPaymentDataJson());
                RecordsJson = (getPaymentFci + 45) % 128;
                return null;
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 89;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(SdkCoreAlternateContactlessPaymentDataImpl ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            $11 = ($10 + 117) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1921 - android.text.TextUtils.getCapsMode("", 0, 0), (char) android.text.TextUtils.indexOf("", "", 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 0, (short) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.normalizeMetaState(0), android.graphics.ImageFormat.getBitsPerPixel(0) + 430, (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31562));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(0, 0, (short) 0, objArr5);
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
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    static /* synthetic */ com.payair.hce.checkPermission writeReplace(com.payair.hce.getMainLooper getmainlooper) {
        int i = RecordsJson;
        int i2 = i + 1;
        getPaymentFci = i2 % 128;
        com.payair.hce.checkPermission checkpermission = getmainlooper.getProfileVersion;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = i + 95;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            return checkpermission;
        }
        throw null;
    }

    public getMainLooper(com.payair.hce.setUpMCBP setupmcbp, com.payair.hce.sendUpdateRNSInformation sendupdaternsinformation, com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep, com.payair.hce.useDemoMode usedemomode, com.payair.hce.VisaRepersoInitializer visaRepersoInitializer, com.payair.hce.getDrawable getdrawable, com.payair.hce.getApplicationInfo getapplicationinfo, boolean z, com.payair.hce.setSendHeaders setsendheaders, com.payair.hce.getPackageName getpackagename, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2, com.payair.hce.getErrors geterrors, com.payair.hce.getOpPackageName getoppackagename, com.payair.hce.obtainStyledAttributes obtainstyledattributes, boolean z2) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("Ṇ봥ḕ쀊\ue835毶櫩鐪䭪ឡ", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getMainLooper.class.getName());
        this.getProfileVersion = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.IccPrivateKeyCrtComponentsJson = false;
        this.values = accessgetcoroutinescopep;
        this.AlternateContactlessPaymentDataJson = visaRepersoInitializer;
        this.DigitizedCardProfile = getdrawable;
        this.getAid = setsendheaders;
        this.writeReplace = z;
        com.payair.hce.onConfigurationChanged onconfigurationchanged = new com.payair.hce.onConfigurationChanged();
        com.payair.hce.onConfigurationChanged values = ((com.payair.hce.onConfigurationChanged) com.payair.hce.onConfigurationChanged.valueOf(new java.lang.Object[]{onconfigurationchanged, getpackagename}, -692469522, 692469524, java.lang.System.identityHashCode(onconfigurationchanged))).valueOf(this).values(accessgetcoroutinescopep);
        com.payair.hce.onConfigurationChanged DigitizedCardProfile = ((com.payair.hce.onConfigurationChanged) com.payair.hce.onConfigurationChanged.valueOf(new java.lang.Object[]{values, visaRepersoInitializer}, -414584072, 414584072, java.lang.System.identityHashCode(values))).AlternateContactlessPaymentDataJson(sendupdaternsinformation).values(usedemomode).DigitizedCardProfile(setupmcbp).valueOf(getoppackagename).valueOf(list).writeReplace(list2).DigitizedCardProfile(getapplicationinfo);
        this.valueOf = ((com.payair.hce.onConfigurationChanged) com.payair.hce.onConfigurationChanged.valueOf(new java.lang.Object[]{DigitizedCardProfile, java.lang.Boolean.valueOf(z)}, 556206952, -556206951, java.lang.System.identityHashCode(DigitizedCardProfile))).DigitizedCardProfile(geterrors).valueOf(obtainstyledattributes).DigitizedCardProfile(z2);
    }

    @Override // com.payair.hce.gotPostData
    public final java.lang.String valueOf(com.payair.hce.sendRequest sendrequest) throws com.payair.hce.setSuccessful {
        RecordsJson = (getPaymentFci + 1) % 128;
        java.lang.String requestDeleteCard = this.AlternateContactlessPaymentDataJson.requestDeleteCard(sendrequest.AlternateContactlessPaymentDataJson(), getAid(sendrequest.AlternateContactlessPaymentDataJson()));
        getPaymentFci = (RecordsJson + 35) % 128;
        return requestDeleteCard;
    }

    private com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] getAid(java.lang.String str) {
        java.util.List<java.lang.String> RecordsJson2;
        com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr;
        int i;
        int i2 = RecordsJson + 117;
        getPaymentFci = i2 % 128;
        if (i2 % 2 == 0) {
            RecordsJson2 = this.values.RecordsJson(str);
            singleUseKeyStatusArr = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[RecordsJson2.size()];
            i = 1;
        } else {
            RecordsJson2 = this.values.RecordsJson(str);
            singleUseKeyStatusArr = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[RecordsJson2.size()];
            i = 0;
        }
        while (i < RecordsJson2.size()) {
            RecordsJson = (getPaymentFci + 9) % 128;
            java.lang.String str2 = RecordsJson2.get(i);
            byte[] DigitizedCardProfile = this.values.DigitizedCardProfile(str, str2);
            final java.lang.String AlternateContactlessPaymentDataJson = this.values.AlternateContactlessPaymentDataJson(str, str2);
            try {
                final int values = this.values.values(str, str2);
                if (values != com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.DigitizedCardProfile.DigitizedCardProfile()) {
                    final com.payair.hce.isNetworkError writeReplace = com.payair.hce.getAssets.writeReplace(DigitizedCardProfile);
                    singleUseKeyStatusArr[i] = new com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus() { // from class: com.payair.hce.getMainLooper.3
                        private static int AlternateContactlessPaymentDataJson = 0;
                        private static int SdkCoreAlternateContactlessPaymentDataImpl = 1;

                        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i3, int i4, int i5) {
                            int i6 = ~i5;
                            int i7 = ~i3;
                            int i8 = ~i4;
                            int i9 = i7 | i8;
                            int i10 = i8 | i6;
                            int i11 = (i3 * 193) + (i4 * 193) + ((i6 | (~(i7 | i4))) * (-192)) + (((~i10) | (~i9)) * (-384)) + (((~(i3 | i10)) | (~(i5 | i9)) | (~(i4 | i3 | i5))) * 192);
                            if (i11 != 1) {
                                return i11 != 2 ? AlternateContactlessPaymentDataJson(objArr) : values(objArr);
                            }
                            com.payair.hce.getMainLooper.AnonymousClass3 anonymousClass3 = (com.payair.hce.getMainLooper.AnonymousClass3) objArr[0];
                            int i12 = SdkCoreAlternateContactlessPaymentDataImpl;
                            AlternateContactlessPaymentDataJson = ((i12 & 69) + (i12 | 69)) % 128;
                            int profileVersion = writeReplace.getProfileVersion();
                            com.payair.hce.getMainLooper.writeReplace(com.payair.hce.getMainLooper.this);
                            int i13 = AlternateContactlessPaymentDataJson;
                            int i14 = (i13 & (-48)) | ((~i13) & 47);
                            int i15 = (i13 & 47) << 1;
                            SdkCoreAlternateContactlessPaymentDataImpl = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                            return java.lang.Integer.valueOf(profileVersion);
                        }

                        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                            com.payair.hce.getMainLooper.AnonymousClass3 anonymousClass3 = (com.payair.hce.getMainLooper.AnonymousClass3) objArr[0];
                            int i3 = AlternateContactlessPaymentDataJson & 3;
                            SdkCoreAlternateContactlessPaymentDataImpl = ((i3 - (~((r0 ^ 3) | i3))) - 1) % 128;
                            com.payair.hce.getMainLooper.writeReplace(com.payair.hce.getMainLooper.this);
                            java.lang.String obj = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(values).toString();
                            int i4 = SdkCoreAlternateContactlessPaymentDataImpl;
                            int i5 = i4 ^ 41;
                            int i6 = ((((i4 & 41) | i5) << 1) - (~(-i5))) - 1;
                            AlternateContactlessPaymentDataJson = i6 % 128;
                            if (i6 % 2 == 0) {
                                return obj;
                            }
                            throw null;
                        }

                        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                            com.payair.hce.getMainLooper.AnonymousClass3 anonymousClass3 = (com.payair.hce.getMainLooper.AnonymousClass3) objArr[0];
                            int i3 = SdkCoreAlternateContactlessPaymentDataImpl | 73;
                            AlternateContactlessPaymentDataJson = (((i3 << 1) - (~(-((~(r0 & 73)) & i3)))) - 1) % 128;
                            if (!((java.lang.String) writeReplace(new java.lang.Object[]{anonymousClass3}, -349735432, 349735432, java.lang.System.identityHashCode(anonymousClass3))).equals(com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf.toString())) {
                                int i4 = AlternateContactlessPaymentDataJson;
                                int i5 = (i4 & (-46)) | ((~i4) & 45);
                                int i6 = (i4 & 45) << 1;
                                SdkCoreAlternateContactlessPaymentDataImpl = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
                                java.lang.String str3 = AlternateContactlessPaymentDataJson;
                                if (str3 != null) {
                                    int i7 = i4 & 23;
                                    int i8 = (i4 | 23) & (~i7);
                                    int i9 = -(-(i7 << 1));
                                    int i10 = (i8 & i9) + (i8 | i9);
                                    SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        return str3;
                                    }
                                    throw new java.lang.ArithmeticException();
                                }
                            }
                            java.lang.String DigitizedCardProfile2 = com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis()));
                            int i11 = AlternateContactlessPaymentDataJson;
                            int i12 = i11 & 101;
                            int i13 = (i11 ^ 101) | i12;
                            SdkCoreAlternateContactlessPaymentDataImpl = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                            return DigitizedCardProfile2;
                        }

                        @Override // com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus
                        public final java.lang.String getTimestamp() {
                            return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1176195283, -1176195281, java.lang.System.identityHashCode(this));
                        }

                        @Override // com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus
                        public final int getAtc() {
                            return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, 138603560, -138603559, java.lang.System.identityHashCode(this))).intValue();
                        }

                        @Override // com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus
                        public final java.lang.String getStatus() {
                            return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -349735432, 349735432, java.lang.System.identityHashCode(this));
                        }
                    };
                    getPaymentFci = (RecordsJson + 111) % 128;
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
            i++;
            RecordsJson = (getPaymentFci + 91) % 128;
        }
        return singleUseKeyStatusArr;
    }

    @Override // com.payair.hce.gotPostData
    public final void values(com.payair.hce.sendRequest sendrequest) throws com.payair.hce.setSuccessful {
        int i = RecordsJson + 25;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            sendrequest.AlternateContactlessPaymentDataJson();
            this.values.valueOf(sendrequest.AlternateContactlessPaymentDataJson(), com.payair.hce.component1.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson());
        } else {
            sendrequest.AlternateContactlessPaymentDataJson();
            this.values.valueOf(sendrequest.AlternateContactlessPaymentDataJson(), com.payair.hce.component1.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson());
            throw null;
        }
    }

    @Override // com.payair.hce.gotPostData
    public final java.util.List<com.payair.hce.sendRequest> AlternateContactlessPaymentDataJson() throws com.payair.hce.setSuccessful {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = this.values.DigitizedCardProfile().iterator();
        RecordsJson = (getPaymentFci + 117) % 128;
        while (it.hasNext()) {
            arrayList.add(writeReplace(it.next()));
            getPaymentFci = (RecordsJson + 43) % 128;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // com.payair.hce.gotPostData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.payair.hce.sendRequest writeReplace(java.lang.String str) throws com.payair.hce.setSuccessful {
        byte[] DigitizedCardProfile;
        com.payair.hce.sendRequest valueOf;
        int i;
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                DigitizedCardProfile = this.values.DigitizedCardProfile(str);
            } catch (java.security.GeneralSecurityException unused) {
            }
            if (DigitizedCardProfile != null) {
                valueOf = this.valueOf.AlternateContactlessPaymentDataJson(DigitizedCardProfile).values(str).valueOf();
                getPaymentFci = (RecordsJson + 71) % 128;
                i = getPaymentFci + 85;
                RecordsJson = i % 128;
                if (i % 2 != 0) {
                    return valueOf;
                }
                throw null;
            }
        }
        valueOf = null;
        i = getPaymentFci + 85;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
        }
    }

    @Override // com.payair.hce.gotPostData
    public final com.payair.hce.setSendHeaders values() {
        int i = getPaymentFci + 17;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return this.getAid;
        }
        throw null;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile(com.payair.hce.checkForSuccess checkforsuccess, java.lang.String str) {
        try {
            byte[] content = new com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson().getContent(checkforsuccess);
            java.util.List<java.lang.String> DigitizedCardProfile = this.values.DigitizedCardProfile();
            if (DigitizedCardProfile != null) {
                getPaymentFci = (RecordsJson + 63) % 128;
                if (DigitizedCardProfile.contains(str)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("礮瞠祪䆔⊁蟯\ueb4c硿Ⱇ\udd67븍틗폫衴ᒿⴒ蚬⊀\ueb2c硱Ⰻ\udd57븙튺폈蠡ᓈ", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    com.payair.hce.getDrawable getdrawable = this.DigitizedCardProfile;
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("쌱䬣썵ᥤḢ⎃뎜\udc33阨\ue1c4\ue6dd皛槔뒈䱯襞㲓ḣ뎣\udc3d阴\ue1f4\ue6c9盶槷뒂䰘", android.text.TextUtils.getOffsetBefore("", 0), objArr2);
                    getdrawable.writeReplace(((java.lang.String) objArr2[0]).intern(), intern, new com.payair.hce.reperso(intern));
                    return;
                }
            }
            this.values.DigitizedCardProfile(str, content, checkforsuccess.getVersion().toString());
            this.DigitizedCardProfile.valueOf(str);
            getPaymentFci = (RecordsJson + 9) % 128;
        } catch (java.security.GeneralSecurityException e) {
            this.DigitizedCardProfile.writeReplace(com.payair.hce.getVisaProvisioningResponse.valueOf.toString(), e.getMessage(), e);
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getMainLooper getmainlooper = (com.payair.hce.getMainLooper) objArr[0];
        java.lang.String str = (java.lang.String) objArr[2];
        java.lang.String str2 = (java.lang.String) objArr[3];
        java.lang.Exception exc = (java.lang.Exception) objArr[4];
        int i = getPaymentFci + 55;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            getmainlooper.DigitizedCardProfile.writeReplace(str, str2, exc);
            int i2 = RecordsJson + 29;
            getPaymentFci = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        getmainlooper.DigitizedCardProfile.writeReplace(str, str2, exc);
        throw null;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(com.payair.hce.checkForSuccess checkforsuccess, java.lang.String str) {
        try {
            byte[] content = new com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson().getContent(checkforsuccess);
            java.util.List<java.lang.String> DigitizedCardProfile = this.values.DigitizedCardProfile();
            synchronized (this.values) {
                if (DigitizedCardProfile != null) {
                    if (DigitizedCardProfile.contains(str)) {
                        this.values.AlternateContactlessPaymentDataJson(str, content, checkforsuccess.getVersion().toString());
                        this.values.IccPrivateKeyCrtComponentsJson(str);
                    }
                }
                this.values.DigitizedCardProfile(str, content, checkforsuccess.getVersion().toString());
                this.values.IccPrivateKeyCrtComponentsJson(str);
            }
            this.DigitizedCardProfile.writeReplace(str);
        } catch (java.security.GeneralSecurityException e) {
            this.DigitizedCardProfile.writeReplace(com.payair.hce.getVisaProvisioningResponse.valueOf.toString(), e.getMessage(), e);
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str) {
        int i = RecordsJson + 21;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            getProfileVersion(str);
            this.DigitizedCardProfile.DigitizedCardProfile(str);
            getPaymentFci = (RecordsJson + 13) % 128;
        } else {
            getProfileVersion(str);
            this.DigitizedCardProfile.DigitizedCardProfile(str);
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        getPaymentFci = (RecordsJson + 37) % 128;
        this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(str, i, str2, str3, exc);
        int i2 = getPaymentFci + 93;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        getPaymentFci = (RecordsJson + 9) % 128;
        this.DigitizedCardProfile.values(i, str, str2, exc);
        getPaymentFci = (RecordsJson + 111) % 128;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.getMainLooper getmainlooper = (com.payair.hce.getMainLooper) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        java.lang.String str2 = (java.lang.String) objArr[3];
        java.lang.String str3 = (java.lang.String) objArr[4];
        java.lang.Exception exc = (java.lang.Exception) objArr[5];
        int i = RecordsJson + 75;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            getmainlooper.DigitizedCardProfile.values(str, intValue, str2, str3, exc);
            RecordsJson = (getPaymentFci + 51) % 128;
            return null;
        }
        getmainlooper.DigitizedCardProfile.values(str, intValue, str2, str3, exc);
        throw null;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(int i, java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        int i2 = RecordsJson + 97;
        getPaymentFci = i2 % 128;
        if (i2 % 2 != 0) {
            this.DigitizedCardProfile.writeReplace(i, str, str2, exc);
        } else {
            this.DigitizedCardProfile.writeReplace(i, str, str2, exc);
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile(java.lang.String str) {
        int i = RecordsJson + 9;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            getProfileVersion(str);
            this.DigitizedCardProfile.values(str);
        } else {
            getProfileVersion(str);
            this.DigitizedCardProfile.values(str);
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void writeReplace() {
        int i = getPaymentFci + 65;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            getProfileVersion();
            this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
        } else {
            getProfileVersion();
            this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf() {
        RecordsJson = (getPaymentFci + 61) % 128;
        getProfileVersion();
        this.DigitizedCardProfile.DigitizedCardProfile();
        int i = getPaymentFci + 77;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(final java.lang.String str, java.lang.String str2, java.util.List<com.payair.hce.isNetworkError> list) {
        int values;
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str3 : this.values.RecordsJson(str)) {
            try {
                values = this.values.values(str, str3);
                int i2 = getPaymentFci;
                RecordsJson = (i2 + 25) % 128;
                i = i2 + 71;
                RecordsJson = i % 128;
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (i % 2 != 0) {
                com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf.DigitizedCardProfile();
                throw new java.lang.ArithmeticException();
            }
            if (values != com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf.DigitizedCardProfile()) {
                arrayList.add(str3);
            }
        }
        if (list != null) {
            RecordsJson = (getPaymentFci + 61) % 128;
            for (final com.payair.hce.isNetworkError isnetworkerror : list) {
                java.lang.String hexString = java.lang.Integer.toHexString(isnetworkerror.getProfileVersion());
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("\uf543㯔\uf573䋾溰킄\ue866⽈", android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
                sb.append(((java.lang.String) objArr[0]).intern().substring(hexString.length()));
                sb.append(hexString);
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(obj);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("塉躵塹쇄\udbd1═歜\uda9cഩ␡", (android.os.Process.getThreadPriority(0) + 20) >> 6, objArr2);
                sb2.append(((java.lang.String) objArr2[0]).intern());
                final java.lang.String obj2 = sb2.toString();
                final java.lang.String DigitizedCardProfile = com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis()));
                final com.payair.hce.isNetworkError isnetworkerror2 = new com.payair.hce.isNetworkError() { // from class: com.payair.hce.getMainLooper.4
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static final byte[] $$d = null;
                    private static final int $$e = 0;
                    private static int $10;
                    private static int $11;
                    private static char[] DigitizedCardProfile;
                    private static long RecordsJson;
                    private static int SdkCoreAlternateContactlessPaymentDataImpl;
                    private static int getProfileVersion;

                    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3, int i3, int i4, int i5) {
                        int i6 = ~i3;
                        int i7 = ~(i3 | i4);
                        return ((((i3 * (-375)) + (i4 * (-375))) + ((((~((~i4) | i6)) | i5) | i7) * 376)) + (((~(i3 | (~i5))) | i7) * (-376))) + (((~(i6 | i5)) | i4) * 376) != 1 ? DigitizedCardProfile(objArr3) : values(objArr3);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr3) {
                        int i3;
                        int i4 = s + 65;
                        byte[] bArr = $$a;
                        int i5 = b2 * 2;
                        int i6 = (b * 2) + 4;
                        char[] cArr = new char[i5 + 1];
                        if (bArr == null) {
                            int i7 = i4;
                            i3 = 0;
                            i4 = i5;
                            i6++;
                            i4 = (i4 + i7) - 2;
                            cArr[i3] = (char) i4;
                            if (i3 == i5) {
                                objArr3[0] = new java.lang.String(cArr);
                                return;
                            }
                            i3++;
                            i7 = bArr[i6];
                            i6++;
                            i4 = (i4 + i7) - 2;
                            cArr[i3] = (char) i4;
                            if (i3 == i5) {
                            }
                        } else {
                            i3 = 0;
                            cArr[i3] = (char) i4;
                            if (i3 == i5) {
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void c(int i3, short s, int i4, java.lang.Object[] objArr3) {
                        int i5;
                        int i6 = i3 * 2;
                        int i7 = 4 - (s * 3);
                        int i8 = 99 - (i4 * 2);
                        byte[] bArr = $$d;
                        byte[] bArr2 = new byte[1 - i6];
                        int i9 = 0 - i6;
                        if (bArr == null) {
                            int i10 = i9;
                            int i11 = 0;
                            i8 += -i10;
                            i7++;
                            i5 = i11;
                            bArr2[i5] = (byte) i8;
                            i11 = i5 + 1;
                            if (i5 == i9) {
                                objArr3[0] = new java.lang.String(bArr2, 0);
                                return;
                            }
                            i10 = bArr[i7];
                            i8 += -i10;
                            i7++;
                            i5 = i11;
                            bArr2[i5] = (byte) i8;
                            i11 = i5 + 1;
                            if (i5 == i9) {
                            }
                        } else {
                            i5 = 0;
                            bArr2[i5] = (byte) i8;
                            i11 = i5 + 1;
                            if (i5 == i9) {
                            }
                        }
                    }

                    private static void a(int i3, char c, int i4, java.lang.Object[] objArr3) {
                        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
                        long[] jArr = new long[i4];
                        getcvmmodel.valueOf = 0;
                        while (getcvmmodel.valueOf < i4) {
                            int i5 = getcvmmodel.valueOf;
                            try {
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile[i3 + getcvmmodel.valueOf])};
                                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                                if (obj3 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 381, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 62389));
                                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                                    c(0, (short) 0, 0, objArr5);
                                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj3);
                                }
                                java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                                if (obj4 == null) {
                                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 35, 3967 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (40222 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj4);
                                }
                                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue();
                                java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                                if (obj5 == null) {
                                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.indexOf("", "", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionType(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
                                }
                                ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr = new char[i4];
                        getcvmmodel.valueOf = 0;
                        $10 = ($11 + 113) % 128;
                        while (getcvmmodel.valueOf < i4) {
                            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                            java.lang.Object[] objArr8 = {getcvmmodel, getcvmmodel};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                            if (obj6 == null) {
                                obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.argb(0, 0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                            }
                            ((java.lang.reflect.Method) obj6).invoke(null, objArr8);
                            $11 = ($10 + 103) % 128;
                        }
                        objArr3[0] = new java.lang.String(cArr);
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final java.lang.String writeReplace() {
                        int i3 = getProfileVersion + 7;
                        int i4 = i3 % 128;
                        SdkCoreAlternateContactlessPaymentDataImpl = i4;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        java.lang.String str4 = obj2;
                        getProfileVersion = (i4 + 119) % 128;
                        return str4;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] valueOf() {
                        java.lang.Object obj3;
                        int i3 = getProfileVersion + 17;
                        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                        if (i3 % 2 != 0) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(android.view.ViewConfiguration.getFadingEdgeLength() / 47, (char) android.view.KeyEvent.normalizeMetaState(0), 2 >>> (android.widget.ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), objArr3);
                            obj3 = objArr3[0];
                        } else {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(android.view.ViewConfiguration.getFadingEdgeLength() >> 16, (char) android.view.KeyEvent.normalizeMetaState(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, objArr4);
                            obj3 = objArr4[0];
                        }
                        byte[] DigitizedCardProfile2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(((java.lang.String) obj3).intern()).DigitizedCardProfile();
                        int i4 = getProfileVersion + 9;
                        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                        if (i4 % 2 == 0) {
                            return DigitizedCardProfile2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] values() {
                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 97) % 128;
                        byte[] values2 = isnetworkerror.values();
                        int i3 = getProfileVersion + 75;
                        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                        if (i3 % 2 == 0) {
                            return values2;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] AlternateContactlessPaymentDataJson() {
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 125) % 128;
                        byte[] AlternateContactlessPaymentDataJson = isnetworkerror.AlternateContactlessPaymentDataJson();
                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 17) % 128;
                        return AlternateContactlessPaymentDataJson;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] DigitizedCardProfile() {
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 59) % 128;
                        byte[] DigitizedCardProfile2 = isnetworkerror.DigitizedCardProfile();
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 47) % 128;
                        return DigitizedCardProfile2;
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                        com.payair.hce.getMainLooper.AnonymousClass4 anonymousClass4 = (com.payair.hce.getMainLooper.AnonymousClass4) objArr3[0];
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 107) % 128;
                        byte[] aid = isnetworkerror.getAid();
                        int i3 = getProfileVersion + 115;
                        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                        if (i3 % 2 == 0) {
                            return aid;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] RecordsJson() {
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 89) % 128;
                        byte[] RecordsJson2 = isnetworkerror.RecordsJson();
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 13) % 128;
                        return RecordsJson2;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] SdkCoreAlternateContactlessPaymentDataImpl() {
                        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 49;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 == 0) {
                            isnetworkerror.SdkCoreAlternateContactlessPaymentDataImpl();
                            throw new java.lang.ArithmeticException();
                        }
                        byte[] SdkCoreAlternateContactlessPaymentDataImpl2 = isnetworkerror.SdkCoreAlternateContactlessPaymentDataImpl();
                        int i4 = getProfileVersion + 21;
                        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                        if (i4 % 2 == 0) {
                            return SdkCoreAlternateContactlessPaymentDataImpl2;
                        }
                        throw null;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] IccPrivateKeyCrtComponentsJson() {
                        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 117) % 128;
                        byte[] IccPrivateKeyCrtComponentsJson = isnetworkerror.IccPrivateKeyCrtComponentsJson();
                        int i3 = getProfileVersion + 41;
                        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                        if (i3 % 2 == 0) {
                            return IccPrivateKeyCrtComponentsJson;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                        com.payair.hce.getMainLooper.AnonymousClass4 anonymousClass4 = (com.payair.hce.getMainLooper.AnonymousClass4) objArr3[0];
                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
                        int profileVersion = isnetworkerror.getProfileVersion();
                        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 117;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 != 0) {
                            return java.lang.Integer.valueOf(profileVersion);
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] SdkCoreBusinessLogicModuleImpl() {
                        java.lang.Object obj3;
                        int i3 = getProfileVersion + 27;
                        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                        if (i3 % 2 != 0) {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(0 / android.text.TextUtils.indexOf("", io.ktor.util.date.GMTDateParser.ZONE), (char) (android.view.ViewConfiguration.getTapTimeout() % 41), 5 - (android.view.ViewConfiguration.getScrollBarSize() << 26), objArr3);
                            obj3 = objArr3[0];
                        } else {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            a(1 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 4, objArr4);
                            obj3 = objArr4[0];
                        }
                        return com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(((java.lang.String) obj3).intern()).DigitizedCardProfile();
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final void getGpoResponse() {
                        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 63;
                        getProfileVersion = i3 % 128;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                    }

                    static {
                        init$1();
                        $10 = 0;
                        $11 = 1;
                        init$0();
                        SdkCoreAlternateContactlessPaymentDataImpl = 0;
                        getProfileVersion = 1;
                        char[] cArr = new char[1713];
                        java.nio.ByteBuffer.wrap("^\u009a\u0003Ä^\u009f\u0003Âä%F\u0088^\u0080\u0003\u0096äpFÎ+ô\u008c\u0019nîÓH´#\u0016\u008cûd\\#>\u009bãIEØ&¸\u008b\u001bmðÎ@³;\u0015\u0098öQ[\"=\u0084\u009ev@Ù%¸^\u0080\u0003\u0096äpFÎ+ô\u008c\u0019nîÓH´#\u0016\u008cûd\\#>\u009bãIEÉ&µ\u008b\u000fmçÎz³,\u0015\u009bö|[2=\u0080\u009esA\t\u001c\u001fûùYG4}\u0093\u0090qgÌÁ«ª\t\u0005äíCª!\u0012üÀZC9,\u0094\u0098rh^\u0080\u0003\u0081älFË+ô\u008c\u0013nîÓ@´2\u0016\u0086ûh\\\u007f>\u0094ãyEÕ&¸\u008b\u0019mëÎV³ \u0015´öl[0=\u0080\u009ec@ß%¯\u0086\u0019Öý\u008bêl\u001cÎ¦£\u0089\u0004gæ\u009b[w<J\u009eås\u001fÔ]>ÚcÍ\u0084;&\u0081K®ìW\u000e²³\u0013Ô3vÀ\u009b%<e^Ù\u0090^Í_*¯\u0088\u0005ådBÒ ;\u001dÕzËØr5\u009e\u0092áð[-\u00ad\u008b#ècEÕ£=v»+ºÌWnð\u0003\u0094¤ F×û0\u009c\u0010>¸ÓTtD\u0016¤ËDmà\u000e\u0089£&E\u0097æm\u009b\u001c~í#»ÄRfö\u000b\u0094¬&\u00ad\u009fðß3\u008fn\u008e\u0089c+ÄF á\u0014\u0003ã¾\u0004Ù*{\u008c\u0096l1pS\u0092\u008e|(ÛK¦æ&\u0000À£\u0007Þ)x\u0081\u009bl6+PÖó{-ÚH¼ë\u001b\u0005þ FÃ*^\u0080\u0003\u0081älFË+¯\u008c\u001bnìÓ\u000b´%\u0016\u0083ûc\\\u007f>\u009dãsEÔ&©\u008b)mÏÎ\b³8\u0015\u0099öa[!^\u0080\u0003\u0081älFË+¯\u008c\u001bnìÓ\u000b´+\u0016\u0083ûo\\\u007f>\u009fã\u007fEÛ&²\u008b\u001amïÎP³\u001e\u0015¦ö~[#=\u009b\u009eg@\u0094%®\u0086\u000f^\u0080\u0003\u0096äpFÎ+ô\u008c\u0010näÓI´2\u0016\u008dûx\\5>\u0080ãb^Ý\u0003\u009dä;FÚ+®\u008c\u0017níÓ@´i\u0016\u0082ûb\\#>\u0087^Á\u0003\u0097ätFË+¾\u008cPnïÓA´3^\u0080\u0003\u0082ägF×+¸\u008cQnçÓM´+\u0016\u008fû~\\)>\u0080ãbEÜ&±\u008b\f^Á\u0003\u0097äxFÍ+¨\u008c\u0018\u000e¥Så´C\u0016°{ÑÜi>\u009d\u0083)ä\\Fæ«[\fEnê³\u0000\u0015´vÂÛf=\u0099\u009e)ãEEá¦\u0013\u000b[M¾\u0010á÷\rU·\u0015FH\u000f¯å\r_`7Ç\u0087/\u0089r\u008b\u0095n7ÞZ±ýX\u001få¢BÅ*g\u0096\u008ah-<O\u0089]Ø\u0000\u0091ç{EÁ(½\u008f\nmåÐV·2^è\u0003\u0097ä{FÁ+¶\u008c\u0011nõÓM´(\u0016\u0084H-\u0015kò\u0089P!=C\u009aþx\u0018\u0091VÌ\u0000+ý\u0089Mä,C\u008d¡n\u001cÓÑ\u009b\u008cÛk}É\u008e¤ï\u0003Wá£\\\u0017;b\u0099ØteÓr±Ðl&Ê\u0096©ù\u0004\\A\u0017\u001c^û´Y\u000e4-\u0093\u0086q?\u0094'Éx.\u0094\u008c2áFFø¤\r\u008dÅÐ\u009a7v\u0095Ðø¤_\u001a½ï\u0000vg2Åß(6Ûo\u00860aÜÃz®\u000e\t°ëEVÜ1\u0098\u0093u~\u009cÙ¨»bf\u00855Ïh\u008f\u008f)-Ú@»ç\u0003\u0005÷¸Cß6}\u008c\u009017/U\u008e\u0088`.ÎM¢\u0088ôÕ¾2V^Ê\u0003\u009fä`FÔ+º\u008c\nnîÓV^î\u0003\u0082äeF\u0098+\u0089\u008c\u000bnïÓP´.\u0016\u0087ûh\\p>\u0095ãyEË&ü\u008b<mêÎW³'\u0015\u0086ök^î\u0003\u009cäqFÊ+´\u008c\u0017nåÓ\u0004´\u0014\u0016®ûF\\p>\u0091ãcEÐ&°\u008b\u000bm¢ÎC³'\u0015\u0099ö.[)=Ì\u009e!yÔ$¦ÃKað\f\u008e«-Ißô>\u0093.1\u0094Ü|{J\u0019«ÄYbê\u0001\u008a¬1J\u0098éy\u0094\u001d2£Ñ\u0014|\u0013\u001aö¹\u001bgß\u0002Ñ¡n^Ý\u0003\u009dä;FÐ+º\u008c\fnåÓS´&\u0016\u0098ûh_Ç\u0002\u0092åvGÓ*²\u008d\u0018oýÒC^Ù\u0003\u0090äzFÀ+ã\u008cH^Ý\u0003\u0093ä{FÛ+³\u008c\u000b^Ý\u0003\u009dä;FÈ+©\u008c\u0011nåÓQ´$\u0016\u009eû#\\2>\u0081ãwE×&¸\u001e\u000fCO¤é\u0006\u0001klÌÞ.=\u0093\u0093ôùV\u0016»®\u001cç~L£±'\u0013^Ý\u0003\u009dä;FË+¾\u008c\u001dnôÓV´\"^\u009f^Ý\u0003\u009dä;FÚ+®\u008c\u0017níÓ@´i\u0016\u009aû\u007f\\?>\u0097ãcEÚ&¨\u0089WÔ\u00193ç\u0091Jü\u001a[\u0098¹'\u0004\u008ch\u00035CÒåp\u0004\u001dpºÉX3å\u009e\u0082· RÍºjà\bJÕ\u00ads\u0015\u0010r½Ó[5ø\u0095\u0085â^È\u0003\u0097ä{FÝ+©\u008c\u0017nâÓ\u000b´4\u0016\u008eûf\\\u007f>\u0094ãsE×&¹\u008b\rmëÎF\f8Qg¶\u008b\u0014-yYÞç<\u0012\u0081\u008bæÏD\"©Ë\u000e\u008flp±\u0082\u0017\"tsÙ÷?J\u009cãá\u0097G|¤\u009b\tÏoaÌ\u0095\u0012#wNÔÏ:\u000b\u009fîü\u008f4\u009fiÀ\u008e,,\u008aAþæ@\u0004µ¹\\Þw|Ò\u009156`TÈ\u0089$/±LøáL\u0007¾¤]Ùx\u007fÙ\u009c71cWÑô)*\u008e5?h`\u008f\u008c-*@^çà\u0005\u0015¸üßÆ}\u007f\u0090\u00957ßU<\u0088×.>M\u0004àþ\u0006\u0017¥½ØÇ~$\u009dÏ0Ö^È\u0003\u009däzFß+·\u008c\u001bn®ÓW´#\u0016\u0081ûR\\7>\u0083ã~EÖ&²\u008b\u001amÝÎ]³p\u0015Ýö![6=\u0091\u009ey@ß%¯\u0086\thàÍy®1\u0010Ôõ9Ó\u0083\u008eÃieË\u0084¦ê\u0001Oã«^\u00169v\u009bÕv7Ñk³ß^Ý\u0003\u009dä;FÚ+´\u008c\u0011nõÓM´*\u0016\u008bûj\\5>ÝãtEÌ&µ\u008b\u0013mæÎ\u000b³.\u0015\u0082ö`[6=\u0091\u009ee@Ê%¯\u0086\thíÍR¹Þä¬\u0003A¡úÌ\u0084k'\u0089Õ49S\u000fñâ\u001c\u000b\u0097!Êa-Ç\u008f&âREë§\u0011\u001a¼}\u0095ßr2\u0098\u0095ß÷\u007f*\u0086\u008c$ïYB\u00ad¤\u0017\u0007½^Û\u0003\u0097äfFÌ+ö^Æ\u0003\u009cä|FÌ+õ\u008c\rn÷ÓG´i\u0016\u009bûh\\=>\u0086ã;EÉ&®\u008b\u0010mòÎV^Þ\u0003\u0097äxFÍ+õ\u008c\u0016nöÓ\n´*\u0016\u008bûd\\>>\u0098ãsEÀ&¯ ¼}õ\u009a\u001a8¯U\u0097òo\u0010\u0085\u00adhÊChé\u0085\u0004\"W@Î\u009d\u0017;ºXÓõx\u0013\u0092°&^Þ\u0003\u0097äxFÍ+õ\u008c\rnçÓ\n´+\u0016\u0089ûi\\\u000f>\u0097ãsE×&¯\u008b\u0016möÎ\\\u000bØV\u0098±>\u0013Ö~»Ù\t;ê\u0086Dá.CÁ®i\t;k\u0092¶a\u0010Ós°Þ\u001e8©\u009bQæ(@\u0083£~\u000e0ÕÊ\u0088\u008ao,ÍÍ £\u0007\u0006åâX\u001d?!\u009d\u0098pw×2µÊh`ÎØ\u00ad¯\u00007æûES82\u009e\u0099áü¼¼[\u001aùö\u0094\u009e32Ñ\u008elg\u000b\u0013©¢D@ã\u0015\u0081ü\\Qúñ\u0099\u009349ÒÆqv\f\u0019ª¸IFä\u001e\u0082¡^Ý\u0003\u009dä;FÈ+©\u008c\u0011nåÓQ´$\u0016\u009eû#\\2>\u0086ã\u007fEÕ&¸\u008bQmäÎL³&\u0015\u008cök[#=\u0084\u009ee@Ó%³\u0086\u0014^Ý\u0003\u009dä;FË+¢\u008c\rnõÓA´*\u0016Äûo\\%>\u009aãzEÝ&ò\u008b\u0019mëÎK³/\u0015\u008eö|[!=\u0086\u009e~@Ô%©^Ý\u0003\u009dä;FË+¢\u008c\rnõÓA´*\u0016µûh\\(>\u0087ã8EÛ&©\u008b\u0016mîÎA³f\u0015\u008dög[?=\u0093\u009er@È%\u00ad\u0086\u0012hêÍH®=¯\u000fòO\u0015é·\u001cÚl}Â\u009f7\"\u0099Eçç\u0016\n½\u00ad÷ÏH\u0012¨´\u000f× zË\u009c9?\u0099Býä\\\u0007®ªóÌTo¬±\u0006Ô{^Ý\u0003\u009dä;FÎ+¾\u008c\u0010nåÓK´5\u0016µûi\\<>\u0098ã{E\u0097&¾\u008b\nmëÎI³,\u0015Åöh[8=\u009a\u009ep@ß%¯\u0086\u0010hñÍO®'\u0010\u0098B³^\u0080\u0003\u0096äpFÎ+ô\u008c\u000fnäÓI´2\u0016µû}\\9>\u0083ãs^\u0080\u0003\u0096äpFÎ+ô\u008c\rnîÓG´,\u0016\u008fûy\\\u007f>\u0091ãwEÊ&¹\u008b\u001dmãÎK³,\u0015´öi[4=\u009a\u009en@ÞÇ\u009d\u009a\u008b}mßÓ²é\u0015\u0010÷óJZ-1\u008f\u0092bdÅb§\u0089znÜÊ¿¸\u0012\u0006^\u0080\u0003\u0096äpFÎ+ô\u008c\rnîÓG´,\u0016\u008fûy\\\u007f>\u0082ãsEÔ&©\u008b\u001bp¢-£ÊNhé\u0005Ö¢-@Æýk\u009a\u00108\u0097Õ[r\u0000\u0010°ÍWkþ\u000e½S¼´Q\u0016ö{\u0092Ü&>Ñ\u00836ä\u0016F¾«R\fBn¢³B\u0015æv\u0082Û\u001d=Ò\u009eyã\u0019Eº¦\\\u000b\u000fm\u0096ÎN\u0010âu\u0082Ö(8Ù\u009dDþ\u0005@´¥_\u0006\u001ahæÍV/é^\u0080\u0003\u0096äpFÎ+ô\u008c\u001cnòÓP´\u0018\u0016\u008dû}\\#!E|S\u009bµ9\u000bT1óÙ\u00117¬\u0095ËÝi[\u0084¡#øAS?mb{\u0085\u009d'#J\u0019íà\u000f\u0003²ªÕÁwb\u009a\u0094=\u0092_|\u0082\u0088$ GWêý\f\u0003¯¬ÒÀtt\u0097\u0087òõ¯ôH\u0019ê¾\u0087Ú nÂ\u0099\u007f~\u0018^ºöW\u001að\n\u0092êO\né®\u008aË'yÁ\u0083b6\u001fR¹òZ\u001f÷A\u0091ó2=ì¥\u0089Æ*|ÄØa \u0002Sû<¦*AÌãr\u008eH) ËNvì\u0011\u009a³5^Òù\u0089\u0001!\\7»Ñ\u0019otUÓ½1S\u008cñë\u0081I2¤Þ\u0003\u009e\u0093\u000eÎ\u0018)þ\u008b@æzA\u0092£|\u001eÞy¤Û\u00016ä\u0091°^\u0080\u0003\u0096äpFÎ+ô\u008c\u001cnòÓP´(\u0016\u0098ûd\\5^\u0080\u0003\u0096äpFÎ+ô\u008c\u001cnòÓP´1\u0016\u0087û~\\7^\u0080\u0003\u0096äpFÎ+ô\u008c\u001cnòÓP´7\u0016\u008dûl\\9>\u0083ãu\u001a=G+ Í\u0002soIÈ¡*O\u0097íð¥R>¿Ý\u0018\u0088w\u0093*\u0085Ígoß\u0002©¥BGöúX\u009d#?\u0097Òru,\u0017\u0081ÊalÙ\u000fà¢BDéçT\u009at<\u009aßnr6\u0014\u008c\u0006)[6¼Ò\u001ees]Ô 6A\u008bãì\u008aN,£Ó\u0004\u008afu»ý\u001dc~\u0001Ó\u00855C\u0096íë\u0093M'®Ã\u0003¾e2ÆÒ\u0018w}\u0011Þ»9¶d´\u0083Q!áL\u008eëg\tÞ´}Ó\u0001q³\u009cI;\u0012Y¶^\u009f\u0003\u0094äsF\u0098+á4²i°\u008eU,åA\u008aæc\u0004À¹sÞ\u0019|¾\u0091\u00106\u000fT \u0089T/ø^È\u0003\u0080ätFÔ+·\u008c\u0011nâÓ\n´ \u0016\u0085ûa\\4>\u0095ã\u007fEÊ&´\u008bQmñÎJfß;\u0087Ük~ã\u0013\u008b´'VÎëg\u008c9.\u0085Ãedb\u0006\u009cÛe1FlQ\u008b§)\u001dD2ãÕ\u0001\"¼\u0086ÛèyM\u0094\u00943õQZ\u008c´*\u001aIyäÊ\u0002j¡\u009bÜãzA\u008c¼Ñï6\u0011\u0094¬ùÙ^{¼\u0091\u00016f]ÄèQh\f\u007fë\u0089I3$\u001c\u0083ûa\u0006Ü¹»Á\u0019vô\u0096^\u0080\u0003\u0096ätFÌ+º\u008cQnåÓK´0\u0016\u0084ûa\\?>\u0092ãrEÊ&ó\u008bQmæÎU³g\u0015\u008aö~[!=\u0087\u009e9@Â%°\u0086\f^\u0080\u0003\u0082ägF×+¸\u008cQnâÓT´2\u0016\u0083ûc\\6>\u009c^è\u0003\u009däyFÜ+½\u008c\u0017nòÓL^\u0080\u0003\u0096ätFÌ+º\u008cQnìÓM´4\u0016\u0089û\"\\ >\u0081ãyEß&µ\u008b\u0013mçÎV³g\u0015\u0088ö{[#=Û\u009e'@\u0095%¾\u0086\u000fhîÍ\b®$\u0010\u0085õlV 8\u009a\u009dn\u007fÒ ¬\u0085\u0015gªÈJ\u00ad/\u000f\u0080ðEU:7\u009b\u0098|".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1713);
                        DigitizedCardProfile = cArr;
                        RecordsJson = -8293061416192965646L;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:113:0x0b6b  */
                    /* JADX WARN: Removed duplicated region for block: B:120:0x0c32  */
                    /* JADX WARN: Removed duplicated region for block: B:164:0x1144  */
                    /* JADX WARN: Removed duplicated region for block: B:171:0x120d A[Catch: all -> 0x01ec, TRY_ENTER, TryCatch #5 {all -> 0x01ec, blocks: (B:6:0x00cf, B:8:0x00e2, B:9:0x0130, B:18:0x0218, B:20:0x025f, B:21:0x02b1, B:28:0x0345, B:30:0x0358, B:31:0x03a9, B:39:0x0472, B:41:0x04ac, B:42:0x0501, B:45:0x0517, B:47:0x0526, B:48:0x0574, B:54:0x062b, B:56:0x0663, B:57:0x06bc, B:76:0x07b7, B:78:0x07ea, B:79:0x083c, B:86:0x08f1, B:88:0x0904, B:89:0x0958, B:97:0x09f7, B:99:0x0a37, B:100:0x0a93, B:104:0x0ad0, B:106:0x0ae3, B:107:0x0b30, B:114:0x0b88, B:116:0x0bc9, B:117:0x0c1c, B:121:0x0c80, B:123:0x0c93, B:124:0x0ce2, B:130:0x0d7c, B:132:0x0dc5, B:133:0x0e20, B:137:0x0e5f, B:139:0x0e72, B:140:0x0ec1, B:146:0x0f26, B:148:0x0f6d, B:149:0x0fc3, B:165:0x115c, B:167:0x11a0, B:168:0x11f7, B:171:0x120d, B:173:0x121c, B:174:0x1265, B:178:0x131d, B:180:0x136c, B:181:0x13c2, B:185:0x13d9, B:187:0x13f1, B:188:0x143f, B:194:0x14fb, B:196:0x1538, B:197:0x1591, B:201:0x15d3, B:203:0x15e6, B:204:0x1638, B:207:0x164a, B:209:0x1667, B:210:0x16b9, B:215:0x2466, B:217:0x2479, B:218:0x24c8, B:229:0x289f, B:231:0x28b2, B:232:0x2901, B:237:0x29af, B:239:0x29c2, B:240:0x2a12, B:248:0x2acf, B:250:0x2b22, B:251:0x2b79, B:266:0x2d6e, B:268:0x2d81, B:269:0x2dde, B:279:0x2ec6, B:281:0x2f03, B:282:0x2f5a, B:299:0x303a, B:301:0x3081, B:302:0x30d8, B:306:0x3119, B:308:0x312c, B:309:0x3180, B:313:0x3223, B:315:0x326e, B:316:0x32c9, B:320:0x32fc, B:323:0x3391, B:326:0x3338, B:338:0x24d4, B:340:0x24f2, B:341:0x2545, B:347:0x1ff8, B:349:0x200b, B:350:0x2059, B:357:0x2075, B:359:0x2088, B:360:0x20df, B:376:0x21e8, B:378:0x2225, B:379:0x2282, B:384:0x2388, B:386:0x23d2, B:387:0x2427, B:392:0x22b1, B:394:0x22f8, B:395:0x234f), top: B:5:0x00cf }] */
                    /* JADX WARN: Removed duplicated region for block: B:217:0x2479 A[Catch: all -> 0x01ec, TryCatch #5 {all -> 0x01ec, blocks: (B:6:0x00cf, B:8:0x00e2, B:9:0x0130, B:18:0x0218, B:20:0x025f, B:21:0x02b1, B:28:0x0345, B:30:0x0358, B:31:0x03a9, B:39:0x0472, B:41:0x04ac, B:42:0x0501, B:45:0x0517, B:47:0x0526, B:48:0x0574, B:54:0x062b, B:56:0x0663, B:57:0x06bc, B:76:0x07b7, B:78:0x07ea, B:79:0x083c, B:86:0x08f1, B:88:0x0904, B:89:0x0958, B:97:0x09f7, B:99:0x0a37, B:100:0x0a93, B:104:0x0ad0, B:106:0x0ae3, B:107:0x0b30, B:114:0x0b88, B:116:0x0bc9, B:117:0x0c1c, B:121:0x0c80, B:123:0x0c93, B:124:0x0ce2, B:130:0x0d7c, B:132:0x0dc5, B:133:0x0e20, B:137:0x0e5f, B:139:0x0e72, B:140:0x0ec1, B:146:0x0f26, B:148:0x0f6d, B:149:0x0fc3, B:165:0x115c, B:167:0x11a0, B:168:0x11f7, B:171:0x120d, B:173:0x121c, B:174:0x1265, B:178:0x131d, B:180:0x136c, B:181:0x13c2, B:185:0x13d9, B:187:0x13f1, B:188:0x143f, B:194:0x14fb, B:196:0x1538, B:197:0x1591, B:201:0x15d3, B:203:0x15e6, B:204:0x1638, B:207:0x164a, B:209:0x1667, B:210:0x16b9, B:215:0x2466, B:217:0x2479, B:218:0x24c8, B:229:0x289f, B:231:0x28b2, B:232:0x2901, B:237:0x29af, B:239:0x29c2, B:240:0x2a12, B:248:0x2acf, B:250:0x2b22, B:251:0x2b79, B:266:0x2d6e, B:268:0x2d81, B:269:0x2dde, B:279:0x2ec6, B:281:0x2f03, B:282:0x2f5a, B:299:0x303a, B:301:0x3081, B:302:0x30d8, B:306:0x3119, B:308:0x312c, B:309:0x3180, B:313:0x3223, B:315:0x326e, B:316:0x32c9, B:320:0x32fc, B:323:0x3391, B:326:0x3338, B:338:0x24d4, B:340:0x24f2, B:341:0x2545, B:347:0x1ff8, B:349:0x200b, B:350:0x2059, B:357:0x2075, B:359:0x2088, B:360:0x20df, B:376:0x21e8, B:378:0x2225, B:379:0x2282, B:384:0x2388, B:386:0x23d2, B:387:0x2427, B:392:0x22b1, B:394:0x22f8, B:395:0x234f), top: B:5:0x00cf }] */
                    /* JADX WARN: Removed duplicated region for block: B:220:0x24d1  */
                    /* JADX WARN: Removed duplicated region for block: B:228:0x289d  */
                    /* JADX WARN: Removed duplicated region for block: B:250:0x2b22 A[Catch: all -> 0x01ec, TryCatch #5 {all -> 0x01ec, blocks: (B:6:0x00cf, B:8:0x00e2, B:9:0x0130, B:18:0x0218, B:20:0x025f, B:21:0x02b1, B:28:0x0345, B:30:0x0358, B:31:0x03a9, B:39:0x0472, B:41:0x04ac, B:42:0x0501, B:45:0x0517, B:47:0x0526, B:48:0x0574, B:54:0x062b, B:56:0x0663, B:57:0x06bc, B:76:0x07b7, B:78:0x07ea, B:79:0x083c, B:86:0x08f1, B:88:0x0904, B:89:0x0958, B:97:0x09f7, B:99:0x0a37, B:100:0x0a93, B:104:0x0ad0, B:106:0x0ae3, B:107:0x0b30, B:114:0x0b88, B:116:0x0bc9, B:117:0x0c1c, B:121:0x0c80, B:123:0x0c93, B:124:0x0ce2, B:130:0x0d7c, B:132:0x0dc5, B:133:0x0e20, B:137:0x0e5f, B:139:0x0e72, B:140:0x0ec1, B:146:0x0f26, B:148:0x0f6d, B:149:0x0fc3, B:165:0x115c, B:167:0x11a0, B:168:0x11f7, B:171:0x120d, B:173:0x121c, B:174:0x1265, B:178:0x131d, B:180:0x136c, B:181:0x13c2, B:185:0x13d9, B:187:0x13f1, B:188:0x143f, B:194:0x14fb, B:196:0x1538, B:197:0x1591, B:201:0x15d3, B:203:0x15e6, B:204:0x1638, B:207:0x164a, B:209:0x1667, B:210:0x16b9, B:215:0x2466, B:217:0x2479, B:218:0x24c8, B:229:0x289f, B:231:0x28b2, B:232:0x2901, B:237:0x29af, B:239:0x29c2, B:240:0x2a12, B:248:0x2acf, B:250:0x2b22, B:251:0x2b79, B:266:0x2d6e, B:268:0x2d81, B:269:0x2dde, B:279:0x2ec6, B:281:0x2f03, B:282:0x2f5a, B:299:0x303a, B:301:0x3081, B:302:0x30d8, B:306:0x3119, B:308:0x312c, B:309:0x3180, B:313:0x3223, B:315:0x326e, B:316:0x32c9, B:320:0x32fc, B:323:0x3391, B:326:0x3338, B:338:0x24d4, B:340:0x24f2, B:341:0x2545, B:347:0x1ff8, B:349:0x200b, B:350:0x2059, B:357:0x2075, B:359:0x2088, B:360:0x20df, B:376:0x21e8, B:378:0x2225, B:379:0x2282, B:384:0x2388, B:386:0x23d2, B:387:0x2427, B:392:0x22b1, B:394:0x22f8, B:395:0x234f), top: B:5:0x00cf }] */
                    /* JADX WARN: Removed duplicated region for block: B:258:0x2aae A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:263:0x2d52  */
                    /* JADX WARN: Removed duplicated region for block: B:278:0x2eae  */
                    /* JADX WARN: Removed duplicated region for block: B:285:0x2f70 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:298:0x301d  */
                    /* JADX WARN: Removed duplicated region for block: B:305:0x30ee  */
                    /* JADX WARN: Removed duplicated region for block: B:336:0x2eab A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:338:0x24d4 A[Catch: all -> 0x01ec, TryCatch #5 {all -> 0x01ec, blocks: (B:6:0x00cf, B:8:0x00e2, B:9:0x0130, B:18:0x0218, B:20:0x025f, B:21:0x02b1, B:28:0x0345, B:30:0x0358, B:31:0x03a9, B:39:0x0472, B:41:0x04ac, B:42:0x0501, B:45:0x0517, B:47:0x0526, B:48:0x0574, B:54:0x062b, B:56:0x0663, B:57:0x06bc, B:76:0x07b7, B:78:0x07ea, B:79:0x083c, B:86:0x08f1, B:88:0x0904, B:89:0x0958, B:97:0x09f7, B:99:0x0a37, B:100:0x0a93, B:104:0x0ad0, B:106:0x0ae3, B:107:0x0b30, B:114:0x0b88, B:116:0x0bc9, B:117:0x0c1c, B:121:0x0c80, B:123:0x0c93, B:124:0x0ce2, B:130:0x0d7c, B:132:0x0dc5, B:133:0x0e20, B:137:0x0e5f, B:139:0x0e72, B:140:0x0ec1, B:146:0x0f26, B:148:0x0f6d, B:149:0x0fc3, B:165:0x115c, B:167:0x11a0, B:168:0x11f7, B:171:0x120d, B:173:0x121c, B:174:0x1265, B:178:0x131d, B:180:0x136c, B:181:0x13c2, B:185:0x13d9, B:187:0x13f1, B:188:0x143f, B:194:0x14fb, B:196:0x1538, B:197:0x1591, B:201:0x15d3, B:203:0x15e6, B:204:0x1638, B:207:0x164a, B:209:0x1667, B:210:0x16b9, B:215:0x2466, B:217:0x2479, B:218:0x24c8, B:229:0x289f, B:231:0x28b2, B:232:0x2901, B:237:0x29af, B:239:0x29c2, B:240:0x2a12, B:248:0x2acf, B:250:0x2b22, B:251:0x2b79, B:266:0x2d6e, B:268:0x2d81, B:269:0x2dde, B:279:0x2ec6, B:281:0x2f03, B:282:0x2f5a, B:299:0x303a, B:301:0x3081, B:302:0x30d8, B:306:0x3119, B:308:0x312c, B:309:0x3180, B:313:0x3223, B:315:0x326e, B:316:0x32c9, B:320:0x32fc, B:323:0x3391, B:326:0x3338, B:338:0x24d4, B:340:0x24f2, B:341:0x2545, B:347:0x1ff8, B:349:0x200b, B:350:0x2059, B:357:0x2075, B:359:0x2088, B:360:0x20df, B:376:0x21e8, B:378:0x2225, B:379:0x2282, B:384:0x2388, B:386:0x23d2, B:387:0x2427, B:392:0x22b1, B:394:0x22f8, B:395:0x234f), top: B:5:0x00cf }] */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x079a  */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x0852  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i3, int i4, int i5) {
                        java.lang.Integer num;
                        java.lang.String str4;
                        java.lang.Integer num2;
                        int i6;
                        java.lang.String str5;
                        int i7;
                        int i8;
                        int i9;
                        int i10;
                        long j;
                        int i11;
                        java.lang.String next;
                        java.lang.Object[] objArr3;
                        int i12;
                        int i13;
                        java.lang.String[][] strArr;
                        java.util.ArrayList arrayList3;
                        java.util.ArrayList arrayList4;
                        java.lang.Object obj3;
                        java.lang.Object invoke;
                        int i14;
                        char c;
                        int i15;
                        int i16;
                        int i17;
                        java.lang.String intern;
                        java.io.File file;
                        java.lang.String next2;
                        java.lang.String[][] strArr2;
                        java.lang.String[] strArr3;
                        java.lang.String str6;
                        int i18;
                        int i19;
                        java.lang.Object obj4;
                        java.lang.String next3;
                        java.lang.String[] strArr4;
                        java.lang.String str7;
                        int i20 = 0;
                        java.lang.Integer num3 = 0;
                        java.lang.String str8 = "";
                        java.lang.Integer num4 = 16;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a(471 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 9 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
                        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(6 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 26 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr5);
                        java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32, (char) android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 24, objArr6);
                        java.lang.String intern4 = ((java.lang.String) objArr6[0]).intern();
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(58 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (8073 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 17, objArr7);
                        java.lang.String intern5 = ((java.lang.String) objArr7[0]).intern();
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        a(android.graphics.Color.argb(0, 0, 0, 0) + 76, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 28, objArr8);
                        java.lang.String[] strArr5 = {intern3, intern4, intern5, ((java.lang.String) objArr8[0]).intern()};
                        int i21 = 0;
                        while (true) {
                            if (i21 >= 4) {
                                num = num3;
                                str4 = intern2;
                                num2 = num4;
                                i6 = i3;
                                break;
                            }
                            try {
                                java.lang.Object[] objArr9 = {strArr5[i21]};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                if (obj5 == null) {
                                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(i20, i20) + 36, 3160 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i20) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(i20) == 0.0d ? 0 : -1)) + 33099));
                                    byte b = $$a[16];
                                    byte b2 = (byte) (b - 1);
                                    byte b3 = b;
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    b(b2, b3, (short) (b3 | 40), objArr10);
                                    java.lang.String str9 = (java.lang.String) objArr10[i20];
                                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                    clsArr[i20] = java.lang.String.class;
                                    obj5 = cls.getMethod(str9, clsArr);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj5);
                                }
                                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).longValue();
                                long j2 = ~longValue;
                                long j3 = i3;
                                num = num3;
                                long j4 = ~j3;
                                str4 = intern2;
                                java.lang.String[] strArr6 = strArr5;
                                long j5 = j4 | (-273102673);
                                int i22 = i21;
                                num2 = num4;
                                long j6 = 1268537576 + (((-885) * longValue) - 484211039229L) + (((~(j2 | 273102672)) | (~(j2 | j3)) | (~(j5 | longValue))) * 886) + (((~(j4 | longValue)) | (-273102673)) * (-1772)) + ((~j5) * 886);
                                int i23 = ~i3;
                                int i24 = ~(1336541142 | i3);
                                if (((((int) j6) & (((((~((-184550553) | i3)) | (~(i23 | (-1621776963)))) * (-318)) - 2146862497) + (((~(457540797 | i3)) | (-2079317760)) * (-318)) + (((~((-457540798) | i3)) | 1894767207) * 318))) | (((int) (j6 >> 32)) & ((((~((-1200217559) | i23)) | 100685268 | i24) * (-502)) + 441623394 + ((i24 | (~((-1099532291) | i23))) * 502)))) != 0) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 109) % 128;
                                    i6 = i3 ^ (i22 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
                                    break;
                                }
                                i21 = i22 + 1;
                                strArr5 = strArr6;
                                num3 = num;
                                intern2 = str4;
                                num4 = num2;
                                i20 = 0;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        int i25 = 3;
                        if (i6 != i3) {
                            java.lang.Object[] objArr11 = {new int[]{i3}, new int[]{i6}, null, null, new int[1]};
                            java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((((~((-1374784611) | r2)) | 676061487) * 226) - 2061496176) + (((~((~i3) | (-1370491969))) | (~((-676061488) | i3)) | 671768845) * (-113)) + ((~(i3 | (-1374784611))) * 113))};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj6 == null) {
                                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.resolveSize(0, 0) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte[] bArr = $$a;
                                byte b4 = bArr[16];
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                b(b4, (byte) (-bArr[18]), (short) (b4 - 1), objArr13);
                                obj6 = cls2.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                            }
                            ((int[]) objArr11[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr12)).intValue();
                            return objArr11;
                        }
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(android.graphics.ImageFormat.getBitsPerPixel(0) + 105, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 34941), 12 - android.view.View.resolveSizeAndState(0, 0, 0), objArr14);
                        java.lang.String intern6 = ((java.lang.String) objArr14[0]).intern();
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(116 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (24666 - android.text.TextUtils.indexOf("", "", 0, 0)), 13 - android.text.TextUtils.indexOf("", "", 0, 0), objArr15);
                        java.lang.String intern7 = ((java.lang.String) objArr15[0]).intern();
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a((android.os.Process.myPid() >> 22) + 129, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 52959), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, objArr16);
                        java.lang.String[] strArr7 = {intern6, intern7, ((java.lang.String) objArr16[0]).intern()};
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                str5 = str8;
                                i7 = i3;
                                break;
                            }
                            java.lang.Object[] objArr17 = {strArr7[i26]};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                            if (obj7 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 36, android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3162, (char) (33099 - (android.os.Process.myPid() >> 22)));
                                byte b5 = (byte) ($$b & 94);
                                byte b6 = (byte) ($$a[16] - 1);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                b(b5, b6, (short) (b6 | 35), objArr18);
                                obj7 = cls3.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj7);
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, objArr17)).longValue();
                            long j7 = i3;
                            str5 = str8;
                            long j8 = ((-301) * longValue2) + 194910165216L + (((~((~j7) | (-643267873) | longValue2)) | (~(643267872 | longValue2 | j7))) * (-302)) + ((~((-643267873) | longValue2 | j7)) * (-604)) + (((~((~longValue2) | 643267872)) | (~(j7 | longValue2))) * 302) + 264202866;
                            int i27 = ~i3;
                            if (((((int) (j8 >> 32)) & (((((~(1282508332 | i3)) | 1575232552) * (-948)) - 233087270) + ((~(1576379948 | i27)) * (-948)) + 582581324)) | (((int) j8) & ((((((~((-3700461) | i27)) | 3167916) | (~(1434058493 | i3))) * 717) - 344128253) + (((~(i27 | 1434058493)) | 3167916 | (~((-3700461) | i3))) * 717)))) != 0) {
                                i7 = (i26 + 270) ^ i3;
                                break;
                            }
                            i26++;
                            str8 = str5;
                            i25 = 3;
                        }
                        if (i7 != i3) {
                            java.lang.Object[] objArr19 = {new int[]{i3}, new int[]{i7}, null, null, new int[1]};
                            java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((((~((-1041130308) | i3)) | 1007551042) | r2) * (-470)) - 1141534019) + (((~(i3 | (-33579266))) | (~((~i3) | 1043295055))) * 470))};
                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj8 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, android.text.TextUtils.getTrimmedLength(str5) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                byte[] bArr2 = $$a;
                                byte b7 = bArr2[16];
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                b(b7, (byte) (-bArr2[18]), (short) (b7 - 1), objArr21);
                                obj8 = cls4.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                            }
                            ((int[]) objArr19[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr20)).intValue();
                            return objArr19;
                        }
                        java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1781008036);
                        if (obj9 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1865 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.view.MotionEvent.axisFromString(str5) + 41776));
                            byte b8 = (byte) ($$b & 94);
                            byte b9 = (byte) ($$a[16] - 1);
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            b(b8, b9, (short) (b9 | 653), objArr22);
                            obj9 = cls5.getMethod((java.lang.String) objArr22[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1781008036, obj9);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj9).invoke(null, null)).longValue();
                        long j9 = ~longValue3;
                        long j10 = i3;
                        long j11 = ~j10;
                        long j12 = (((((46 * longValue3) - 26247213324L) + (((~(j9 | j11)) | (-570591594)) * (-90))) + (((~(longValue3 | (-570591594))) | (~(j9 | j10))) * (-45))) + (((~((-570591594) | j11)) | (j9 | (~(570591593 | j10)))) * 45)) - 1358621268;
                        int i28 = ~i3;
                        int i29 = (((int) (j12 >> 32)) & (((~((-272761253) | i3)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 212102886 + (((~((-272761253) | i28)) | 34607104) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) j12) & ((((~(2097261905 | i28)) | 660035495) * (-235)) + 606502057 + (((~(2097261905 | i3)) | 660035495) * (-470)) + (((~(2136473591 | i3)) | 620823809) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)));
                        int i30 = i29 != 0 ? (i29 + 199) ^ i3 : i3;
                        if (i30 != i3) {
                            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 91) % 128;
                            java.lang.Object[] objArr23 = {new int[]{i3}, new int[]{i30}, null, null, new int[1]};
                            java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~((-977254897) | i3)) | 133200) * (-566)) + 2126237297 + ((~(i3 | (-977121697))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj10 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, 2712 - android.text.TextUtils.indexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                byte[] bArr3 = $$a;
                                byte b10 = bArr3[16];
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                b(b10, (byte) (-bArr3[18]), (short) (b10 - 1), objArr25);
                                obj10 = cls6.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                            }
                            ((int[]) objArr23[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr24)).intValue();
                            return objArr23;
                        }
                        java.lang.String str10 = str5;
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 146, (char) (android.view.View.combineMeasuredStates(0, 0) + 10299), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 20, objArr26);
                        java.lang.String intern8 = ((java.lang.String) objArr26[0]).intern();
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        a(android.graphics.Color.argb(0, 0, 0, 0) + 167, (char) (8224 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 6 - android.view.View.combineMeasuredStates(0, 0), objArr27);
                        java.lang.String intern9 = ((java.lang.String) objArr27[0]).intern();
                        java.io.File file2 = new java.io.File(intern8);
                        if (file2.exists() && file2.isFile()) {
                            try {
                                java.util.Scanner scanner = new java.util.Scanner(new java.io.FileInputStream(file2));
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a(android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, (char) (62316 - android.view.KeyEvent.normalizeMetaState(0)), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3, objArr28);
                                java.util.Scanner useDelimiter = scanner.useDelimiter(((java.lang.String) objArr28[0]).intern());
                                if (useDelimiter.hasNext()) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 9) % 128;
                                    str7 = useDelimiter.next();
                                } else {
                                    str7 = str10;
                                }
                                useDelimiter.close();
                            } catch (java.io.IOException unused2) {
                            }
                            if (str7.contains(intern9)) {
                                int i31 = getProfileVersion;
                                int i32 = i31 + 39;
                                SdkCoreAlternateContactlessPaymentDataImpl = i32 % 128;
                                if (i32 % 2 == 0) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (i31 + 91) % 128;
                                    i8 = i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                                    if (i8 == i3) {
                                        java.lang.Object[] objArr29 = {new int[]{i3}, new int[]{i8}, null, null, new int[1]};
                                        int i33 = ~(1200776032 | i28);
                                        java.lang.Object[] objArr30 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((1158701376 | i33) * (-970)) - 1447961391) + ((i33 | 42074656) * 970))};
                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj11 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getOffsetBefore(str10, 0) + 2713, (char) android.text.TextUtils.indexOf(str10, str10));
                                            byte[] bArr4 = $$a;
                                            byte b11 = bArr4[16];
                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                            b(b11, (byte) (-bArr4[18]), (short) (b11 - 1), objArr31);
                                            obj11 = cls7.getMethod((java.lang.String) objArr31[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                                        }
                                        ((int[]) objArr29[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr30)).intValue();
                                        return objArr29;
                                    }
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    a(android.view.View.MeasureSpec.getMode(0) + 175, (char) (android.view.View.MeasureSpec.getMode(0) + 27919), 32 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr32);
                                    java.lang.String intern10 = ((java.lang.String) objArr32[0]).intern();
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 206, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 22 - android.view.MotionEvent.axisFromString(str10), objArr33);
                                    java.lang.String intern11 = ((java.lang.String) objArr33[0]).intern();
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    a(229 - android.text.TextUtils.indexOf(str10, str10), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29, objArr34);
                                    java.lang.String intern12 = ((java.lang.String) objArr34[0]).intern();
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionType(0L) + 257, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.graphics.Color.red(0) + 14, objArr35);
                                    java.lang.String[] strArr8 = {intern10, intern11, intern12, ((java.lang.String) objArr35[0]).intern()};
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 >= 4) {
                                            i9 = i3;
                                            break;
                                        }
                                        java.lang.Object[] objArr36 = {strArr8[i34]};
                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                        if (obj12 == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.alpha(0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3161, (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 33100));
                                            byte b12 = $$a[16];
                                            byte b13 = (byte) (b12 - 1);
                                            byte b14 = b12;
                                            strArr4 = strArr8;
                                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                                            b(b13, b14, (short) (b14 | 40), objArr37);
                                            obj12 = cls8.getMethod((java.lang.String) objArr37[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj12);
                                        } else {
                                            strArr4 = strArr8;
                                        }
                                        long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj12).invoke(null, objArr36)).longValue();
                                        long j13 = ((-782) * longValue4) + 537669812288L + ((~longValue4) * (-783)) + ((~((-685803333) | j11 | longValue4)) * (-783)) + (((~(longValue4 | j11)) | (-685803333)) * 783) + 309631571;
                                        if (((((int) (j13 >> 32)) & (((((-1234534803) | i3) * 376) - 2088991750) + (((~((-829691364) | i28)) | 811603041) * (-376)) + (((~(829691363 | i3)) | (-2028049522)) * 376))) | (((int) j13) & ((((~(321512378 | i3)) | (-1758738789)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 753755445 + (((~(321512378 | i28)) | (-2080242687)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE)))) != 0) {
                                            i9 = (i34 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) ^ i3;
                                            break;
                                        }
                                        i34++;
                                        strArr8 = strArr4;
                                    }
                                    if (i9 != i3) {
                                        java.lang.Object[] objArr38 = {new int[]{i3}, new int[]{i9}, null, null, new int[1]};
                                        java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~(i3 | 820587891)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 538596023) + (((-1226063885) | i28) * (-216)) + (((~(i28 | 820587891)) | 1230258206) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                        java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj13 == null) {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2714 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                            byte[] bArr5 = $$a;
                                            byte b15 = bArr5[16];
                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                            b(b15, (byte) (-bArr5[18]), (short) (b15 - 1), objArr40);
                                            obj13 = cls9.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj13);
                                        }
                                        ((int[]) objArr38[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr39)).intValue();
                                        return objArr38;
                                    }
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    a(android.widget.ExpandableListView.getPackedPositionChild(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr41);
                                    java.lang.Object[] objArr42 = {((java.lang.String) objArr41[0]).intern()};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj14 == null) {
                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 40, 1921 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                        byte b16 = (byte) ($$b & 94);
                                        byte b17 = (byte) ($$a[16] - 1);
                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                        b(b16, b17, (short) (b17 | 653), objArr43);
                                        obj14 = cls10.getMethod((java.lang.String) objArr43[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                                    }
                                    java.lang.String str11 = (java.lang.String) ((java.lang.reflect.Method) obj14).invoke(null, objArr42);
                                    if (str11 != null) {
                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                        a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 9, objArr44);
                                        if (str11.contains(((java.lang.String) objArr44[0]).intern())) {
                                            i10 = i3 ^ 250;
                                            if (i10 == i3) {
                                                java.lang.Object[] objArr45 = {new int[]{i3}, new int[]{i10}, null, null, new int[1]};
                                                int i35 = ~(515780032 | i28);
                                                java.lang.Object[] objArr46 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((1094783505 | i35) * (-712)) + 1933028569 + (((~(i3 | 1610563537)) | (~(i28 | (-1094783506)))) * (-712)) + (((-1535066066) | i35) * 712))};
                                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj15 == null) {
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str10, str10), 2713 - android.text.TextUtils.getTrimmedLength(str10), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                                    byte[] bArr6 = $$a;
                                                    byte b18 = bArr6[16];
                                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                                    b(b18, (byte) (-bArr6[18]), (short) (b18 - 1), objArr47);
                                                    obj15 = cls11.getMethod((java.lang.String) objArr47[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj15);
                                                }
                                                ((int[]) objArr45[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj15).invoke(null, objArr46)).intValue();
                                                return objArr45;
                                            }
                                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                                            a(293 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.graphics.Color.blue(0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, objArr48);
                                            java.lang.String intern13 = ((java.lang.String) objArr48[0]).intern();
                                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                                            a((android.os.Process.myTid() >> 22) + 310, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), 7 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr49);
                                            java.lang.Object[] objArr50 = {intern13, ((java.lang.String) objArr49[0]).intern()};
                                            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                            if (obj16 == null) {
                                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.getTrimmedLength(str10), 2213 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.normalizeMetaState(0));
                                                byte b19 = (byte) ($$b & 94);
                                                byte b20 = (byte) ($$a[16] - 1);
                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                b(b19, b20, (short) (b20 | 653), objArr51);
                                                obj16 = cls12.getMethod((java.lang.String) objArr51[0], java.lang.String.class, java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj16);
                                            }
                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr50)).longValue();
                                            long j14 = ~longValue5;
                                            long j15 = ((((((-756) * longValue5) - 105251903532L) + (((-138854754) | j11) * (-757))) + ((~(((-138854754) | j14) | j10)) * 1514)) + (((~((longValue5 | (-138854754)) | j10)) | ((~(j14 | j11)) | (~(138854753 | j14)))) * 757)) - 596519848;
                                            int i36 = ((((int) (j15 >> 32)) & (((((-526865) | i28) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (-720399350)) + (((~((-11385394) | i28)) | 1458943469) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) j15) & (((((~((-34079105) | i3)) | 134359049) * 449) + 45783363) + (((~((-34079105) | i28)) | 134359049) * 449)))) != 0 ? i3 ^ 251 : i3;
                                            if (i36 != i3) {
                                                java.lang.Object[] objArr52 = {new int[]{i3}, new int[]{i36}, null, null, new int[1]};
                                                java.lang.Object[] objArr53 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~((-1172945972) | i3)) | (~(1979432319 | i28))) * (-406)) + 1580374879 + ((~((-1101532194) | i28)) * (-406)) + (((~(i3 | (-877900127))) | (~(i28 | 1172945971))) * 406))};
                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj17 == null) {
                                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str10, str10, 0, 0), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                    byte[] bArr7 = $$a;
                                                    byte b21 = bArr7[16];
                                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                    b(b21, (byte) (-bArr7[18]), (short) (b21 - 1), objArr54);
                                                    obj17 = cls13.getMethod((java.lang.String) objArr54[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj17);
                                                }
                                                ((int[]) objArr52[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj17).invoke(null, objArr53)).intValue();
                                                return objArr52;
                                            }
                                            java.lang.Object[] objArr55 = new java.lang.Object[1];
                                            a((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 316, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20599), android.view.View.MeasureSpec.getSize(0) + 23, objArr55);
                                            java.lang.Object[] objArr56 = {((java.lang.String) objArr55[0]).intern()};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj18 == null) {
                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1922 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.view.View.getDefaultSize(0, 0));
                                                byte b22 = (byte) ($$b & 94);
                                                byte b23 = (byte) ($$a[16] - 1);
                                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                b(b22, b23, (short) (b23 | 653), objArr57);
                                                obj18 = cls14.getMethod((java.lang.String) objArr57[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                            }
                                            java.lang.String lowerCase = ((java.lang.String) ((java.lang.reflect.Method) obj18).invoke(null, objArr56)).toLowerCase();
                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                            a(338 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4981), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 4, objArr58);
                                            int i37 = lowerCase.contains(((java.lang.String) objArr58[0]).intern()) ? i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE : i3;
                                            if (i37 != i3) {
                                                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 117) % 128;
                                                java.lang.Object[] objArr59 = {new int[]{i3}, new int[]{i37}, null, null, new int[1]};
                                                java.lang.Object[] objArr60 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((((~(i28 | (-555222285))) | (~(2046647663 | i3))) * (-302)) - 241687285) + ((~((-555222285) | i3)) * (-604)) + (((~(i3 | 1491425379)) | 1487226945) * 302))};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj19 == null) {
                                                    java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.graphics.Color.green(0) + 2713, (char) android.text.TextUtils.getTrimmedLength(str10));
                                                    byte[] bArr8 = $$a;
                                                    byte b24 = bArr8[16];
                                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                                    b(b24, (byte) (-bArr8[18]), (short) (b24 - 1), objArr61);
                                                    obj19 = cls15.getMethod((java.lang.String) objArr61[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj19);
                                                }
                                                ((int[]) objArr59[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr60)).intValue();
                                                return objArr59;
                                            }
                                            java.lang.Object[] objArr62 = new java.lang.Object[1];
                                            a(android.os.Process.getGidForName(str10) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - android.view.KeyEvent.normalizeMetaState(0), objArr62);
                                            java.lang.String intern14 = ((java.lang.String) objArr62[0]).intern();
                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                            a(343 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (19359 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 6, objArr63);
                                            java.lang.String intern15 = ((java.lang.String) objArr63[0]).intern();
                                            java.io.File file3 = new java.io.File(intern14);
                                            if (file3.exists() && file3.isFile()) {
                                                try {
                                                    java.util.Scanner scanner2 = new java.util.Scanner(new java.io.FileInputStream(file3));
                                                    java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                    a(173 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (62317 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.text.TextUtils.getCapsMode(str10, 0, 0) + 2, objArr64);
                                                    java.util.Scanner useDelimiter2 = scanner2.useDelimiter(((java.lang.String) objArr64[0]).intern());
                                                    next3 = useDelimiter2.hasNext() ? useDelimiter2.next() : str10;
                                                    useDelimiter2.close();
                                                } catch (java.io.IOException unused3) {
                                                }
                                                if (next3.contains(intern15)) {
                                                    i11 = i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                                    j = j11;
                                                    if (i11 != i3) {
                                                        java.lang.Object[] objArr65 = {new int[]{i3}, new int[]{i11}, null, null, new int[1]};
                                                        java.lang.Object[] objArr66 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((((~((-765079850) | i28)) | (-1285766249)) * (-865)) - 1666290254) + ((~(i3 | 765079849)) * 865) + (((~((-1285766249) | i28)) | (~(i28 | 765079849))) * 865))};
                                                        java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj20 == null) {
                                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                            byte[] bArr9 = $$a;
                                                            byte b25 = bArr9[16];
                                                            java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                            b(b25, (byte) (-bArr9[18]), (short) (b25 - 1), objArr67);
                                                            obj20 = cls16.getMethod((java.lang.String) objArr67[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj20);
                                                        }
                                                        ((int[]) objArr65[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj20).invoke(null, objArr66)).intValue();
                                                        return objArr65;
                                                    }
                                                    java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1102036426);
                                                    if (obj21 == null) {
                                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 44, 2763 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.os.Process.getGidForName(str10) + 1));
                                                        byte b26 = (byte) ($$b & 94);
                                                        byte b27 = (byte) ($$a[16] - 1);
                                                        java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                        b(b26, b27, (short) (b27 | 653), objArr68);
                                                        obj21 = cls17.getMethod((java.lang.String) objArr68[0], null);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1102036426, obj21);
                                                    }
                                                    long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, null)).longValue();
                                                    long j16 = ~longValue6;
                                                    long j17 = (((-317) * longValue6) - 141216600811L) + (((~(442685268 | j10)) | j16) * (-318)) + (((~(j16 | j10)) | (~(j | (-442685269) | longValue6))) * 318) + (((~(longValue6 | (-442685269) | j10)) | (~(j16 | j | (-442685269)))) * 318) + 567722032;
                                                    if (((((int) (j17 >> 32)) & ((((((~(1489206924 | i28)) | (~(1368533960 | i3))) | (~((-1368533961) | i28))) * 959) - 722068900) + (((~(1489206924 | i3)) | (~(1368533960 | i28)) | (~((-1368533961) | i3))) * 959))) | (((int) j17) & (((((~((-383401590) | i28)) | 307898976) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) - 501357939) + ((~((-307898977) | i3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(1820627999 | i28)) | (-2128526976) | (~((-75502614) | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) == 1) {
                                                        java.lang.Object[] objArr69 = {new int[]{i3}, new int[]{i3}, null, null, new int[1]};
                                                        java.lang.Object[] objArr70 = {java.lang.Integer.valueOf(i5), num, java.lang.Integer.valueOf((((~((-1596508431) | i28)) | (~(1597828495 | i3))) * (-831)) + 2006977734 + ((~((-1143490829) | i3)) * (-1662)) + (((~(i3 | 454337667)) | (~(i28 | (-454337668))) | (~(1596508430 | i3))) * 831))};
                                                        java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj22 == null) {
                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str10, 0) + 50, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2713, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                            byte[] bArr10 = $$a;
                                                            byte b28 = bArr10[16];
                                                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                            b(b28, (byte) (-bArr10[18]), (short) (b28 - 1), objArr71);
                                                            obj22 = cls18.getMethod((java.lang.String) objArr71[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                                        }
                                                        ((int[]) objArr69[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr70)).intValue();
                                                        return objArr69;
                                                    }
                                                    java.lang.Object[] objArr72 = {1};
                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                    if (obj23 == null) {
                                                        java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2363 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                        byte b29 = (byte) ($$b & 94);
                                                        byte b30 = (byte) ($$a[16] - 1);
                                                        java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                        b(b29, b30, (short) (b30 | 653), objArr73);
                                                        obj23 = cls19.getMethod((java.lang.String) objArr73[0], java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj23);
                                                    }
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr72)).longValue();
                                                    long j18 = 659116686 | longValue7;
                                                    long j19 = j | (-659116687);
                                                    long j20 = ~(j18 | j10);
                                                    long j21 = (503 * longValue7) + 331535693058L + (j18 * (-502)) + (((~((-659116687) | (~longValue7))) | (~j19) | j20) * (-502)) + (((~(longValue7 | j19)) | j20) * 502) + 748793513;
                                                    int i38 = ((((int) (j21 >> 32)) & ((((((~((-101744642) | i28)) | (~(1335481769 | i3))) * (-272)) + 877111338) + (((~((-101761066) | i3)) | 16424) * (-272))) + (((~(101761065 | i3)) | 1335465345) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))) | (((int) j21) & ((((((-981043984) | i28) * (-757)) + 674533468) + ((~((-541655302) | i3)) * 1514)) + ((((~(456182426 | i28)) | (-997837728)) | (~((-439388683) | i3))) * 757)))) != 0 ? i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE : i3;
                                                    if (i38 != i3) {
                                                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
                                                        java.lang.Object[] objArr74 = {new int[]{i3}, new int[]{i38}, null, null, new int[1]};
                                                        java.lang.Object[] objArr75 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~(61195055 | i28)) | (-2008542064)) * 529) + 321706580 + (((~(i3 | 61195055)) | (-1989651043)) * 529))};
                                                        java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj24 == null) {
                                                            java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2712, (char) android.view.View.combineMeasuredStates(0, 0));
                                                            byte[] bArr11 = $$a;
                                                            byte b31 = bArr11[16];
                                                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                            b(b31, (byte) (-bArr11[18]), (short) (b31 - 1), objArr76);
                                                            obj24 = cls20.getMethod((java.lang.String) objArr76[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                                        }
                                                        ((int[]) objArr74[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr75)).intValue();
                                                        return objArr74;
                                                    }
                                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 317, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20600), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, objArr77);
                                                    java.lang.Object[] objArr78 = {((java.lang.String) objArr77[0]).intern()};
                                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj25 == null) {
                                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 40, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1921, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                        byte b32 = (byte) ($$b & 94);
                                                        byte b33 = (byte) ($$a[16] - 1);
                                                        java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                        b(b32, b33, (short) (b33 | 653), objArr79);
                                                        obj25 = cls21.getMethod((java.lang.String) objArr79[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj25);
                                                    }
                                                    java.lang.Object invoke2 = ((java.lang.reflect.Method) obj25).invoke(null, objArr78);
                                                    if (invoke2 != null) {
                                                        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 85) % 128;
                                                        java.lang.Object[] objArr80 = {invoke2, 42};
                                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                        if (obj26 == null) {
                                                            java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 28, 2594 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                            byte b34 = (byte) ($$b & 94);
                                                            byte b35 = (byte) ($$a[16] - 1);
                                                            java.lang.Object[] objArr81 = new java.lang.Object[1];
                                                            b(b34, b35, (short) (b35 | 653), objArr81);
                                                            obj26 = cls22.getMethod((java.lang.String) objArr81[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj26);
                                                        }
                                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr80)).longValue();
                                                        long j22 = ~longValue8;
                                                        long j23 = (((-565) * longValue8) - 168416355303L) + (((~(longValue8 | 297030608)) | (~(j10 | 297030608))) * (-566)) + ((~((-297030609) | j22)) * 566) + ((~(297030608 | j22 | j10)) * 566) + 1554131133;
                                                        if (((((int) (j23 >> 32)) & (((((~((-433367631) | i28)) | 1003858780) * (-235)) - 433371604) + (((~((-433367631) | i3)) | 1003858780) * (-470)) + (((~(i3 | (-3))) | 570491152) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) j23) & ((((~((-178522614) | i3)) | (~((-1615484427) | i28))) * (-406)) + 1187585187 + ((~((-264598) | i28)) * (-406)) + (((~(1615749023 | i3)) | (~(178522613 | i28))) * 406)))) == 1986687685) {
                                                            i13 = 0;
                                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                            a(android.view.KeyEvent.normalizeMetaState(i13) + 452, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 27410), (android.widget.ExpandableListView.getPackedPositionForChild(i13, i13) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i13, i13) == 0L ? 0 : -1)) + 17, objArr82);
                                                            java.lang.Object[] objArr83 = {((java.lang.String) objArr82[i13]).intern()};
                                                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                            if (obj3 == null) {
                                                                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), android.text.TextUtils.indexOf(str10, str10, 0, 0) + 1921, (char) (android.os.Process.myTid() >> 22));
                                                                byte b36 = (byte) ($$b & 94);
                                                                byte b37 = (byte) ($$a[16] - 1);
                                                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                                                b(b36, b37, (short) (b37 | 653), objArr84);
                                                                obj3 = cls23.getMethod((java.lang.String) objArr84[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj3);
                                                            }
                                                            invoke = ((java.lang.reflect.Method) obj3).invoke(null, objArr83);
                                                            if (invoke != null) {
                                                                i14 = 0;
                                                            } else {
                                                                java.lang.Object[] objArr85 = {invoke, 42};
                                                                java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                                if (obj27 == null) {
                                                                    java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str10, str10) + 28, 2593 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                                                                    byte b38 = (byte) ($$b & 94);
                                                                    byte b39 = (byte) ($$a[16] - 1);
                                                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                                                    b(b38, b39, (short) (b39 | 653), objArr86);
                                                                    obj27 = cls24.getMethod((java.lang.String) objArr86[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj27);
                                                                }
                                                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr85)).longValue();
                                                                long j24 = ((565 * longValue9) - 64892097825L) + (((~((~longValue9) | j)) | (-115261276) | (~(longValue9 | j10))) * (-564)) + ((~((-115261276) | longValue9 | j10)) * 1128) + (((~(longValue9 | 115261275)) | (~(j | (-115261276)))) * 564) + 1141839249;
                                                                i14 = (((int) (j24 >> 32)) & (((((~(1744763475 | i3)) | (~((-1112977410) | i3))) * 69) - 2135887856) + (((~(1205778963 | i3)) | 538984512 | (~((-1651961922) | i3))) * (-69)) + 2108339930)) | (((int) j24) & ((((~((-1449511679) | i3)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) - 296374883) + (((~((-1449511679) | i28)) | 10106112) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING)));
                                                            }
                                                            if (i14 != 1986687685 && i14 != -1514516938) {
                                                                java.lang.Object[] objArr87 = new java.lang.Object[1];
                                                                a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1166, (char) android.view.View.getDefaultSize(0, 0), 14 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr87);
                                                                java.lang.String intern16 = ((java.lang.String) objArr87[0]).intern();
                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                a(android.graphics.Color.green(0) + 1181, (char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 27, objArr88);
                                                                java.lang.String intern17 = ((java.lang.String) objArr88[0]).intern();
                                                                java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                                a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1207, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 39197), 16 - android.os.Process.getGidForName(str10), objArr89);
                                                                java.lang.String intern18 = ((java.lang.String) objArr89[0]).intern();
                                                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                                a(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 1224, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - android.view.View.getDefaultSize(0, 0), objArr90);
                                                                java.lang.String intern19 = ((java.lang.String) objArr90[0]).intern();
                                                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                                a(1241 - android.text.TextUtils.getCapsMode(str10, 0, 0), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11810), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 15, objArr91);
                                                                java.lang.String intern20 = ((java.lang.String) objArr91[0]).intern();
                                                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                                a(1256 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 20541), 37 - android.graphics.Color.green(0), objArr92);
                                                                java.lang.String intern21 = ((java.lang.String) objArr92[0]).intern();
                                                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1293, (char) android.text.TextUtils.getOffsetAfter(str10, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr93);
                                                                java.lang.String intern22 = ((java.lang.String) objArr93[0]).intern();
                                                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                                a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1304, (char) (android.view.View.getDefaultSize(0, 0) + 32709), 13 - android.text.TextUtils.indexOf(str10, str10, 0), objArr94);
                                                                java.lang.String intern23 = ((java.lang.String) objArr94[0]).intern();
                                                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                                a(1318 - android.view.KeyEvent.keyCodeFromString(str10), (char) (25069 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr95);
                                                                java.lang.String intern24 = ((java.lang.String) objArr95[0]).intern();
                                                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                                                a(android.view.View.getDefaultSize(0, 0) + 1340, (char) (44149 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 31 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr96);
                                                                java.lang.String intern25 = ((java.lang.String) objArr96[0]).intern();
                                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                a(1370 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (42428 - android.text.TextUtils.getOffsetBefore(str10, 0)), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr97);
                                                                java.lang.String intern26 = ((java.lang.String) objArr97[0]).intern();
                                                                java.lang.Object[] objArr98 = new java.lang.Object[1];
                                                                a(android.view.MotionEvent.axisFromString(str10) + 1384, (char) (24481 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr98);
                                                                java.lang.String intern27 = ((java.lang.String) objArr98[0]).intern();
                                                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                                                a(1395 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52622), 12 - android.graphics.Color.alpha(0), objArr99);
                                                                java.lang.String intern28 = ((java.lang.String) objArr99[0]).intern();
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                a(1407 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 12 - android.view.View.MeasureSpec.getSize(0), objArr100);
                                                                java.lang.String intern29 = ((java.lang.String) objArr100[0]).intern();
                                                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                                a(android.view.View.MeasureSpec.getSize(0) + 1419, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - android.view.View.getDefaultSize(0, 0), objArr101);
                                                                java.lang.String intern30 = ((java.lang.String) objArr101[0]).intern();
                                                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                                                a(1432 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.View.getDefaultSize(0, 0) + 14, objArr102);
                                                                java.lang.String intern31 = ((java.lang.String) objArr102[0]).intern();
                                                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                a(android.view.View.getDefaultSize(0, 0) + 1445, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 17597), android.text.TextUtils.getTrimmedLength(str10) + 12, objArr103);
                                                                java.lang.String intern32 = ((java.lang.String) objArr103[0]).intern();
                                                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                a(1457 - android.graphics.Color.alpha(0), (char) (android.view.View.combineMeasuredStates(0, 0) + 10515), 24 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr104);
                                                                java.lang.String intern33 = ((java.lang.String) objArr104[0]).intern();
                                                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                                                a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1481, (char) (22697 - android.text.TextUtils.getOffsetBefore(str10, 0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 28, objArr105);
                                                                java.lang.String[] strArr9 = {intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, intern29, intern30, intern31, intern32, intern33, ((java.lang.String) objArr105[0]).intern()};
                                                                i18 = 0;
                                                                while (true) {
                                                                    if (i18 < 19) {
                                                                        i18 = -1;
                                                                        break;
                                                                    }
                                                                    java.lang.String str12 = strArr9[i18];
                                                                    java.lang.Object[] objArr106 = {str12};
                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                    if (obj28 == null) {
                                                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.green(0) + 3161, (char) (33099 - android.widget.ExpandableListView.getPackedPositionType(0L)));
                                                                        byte b40 = (byte) ($$b & 94);
                                                                        byte b41 = (byte) ($$a[16] - 1);
                                                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                        b(b40, b41, (short) (b41 | 653), objArr107);
                                                                        obj28 = cls25.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj28);
                                                                    }
                                                                    long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj28).invoke(null, objArr106)).longValue();
                                                                    long j25 = ~((~longValue10) | j10);
                                                                    long j26 = ((((((-574) * longValue10) + 607022032302L) + (((~(j | 1057529672)) | j25) * 1150)) + (((~(j | longValue10)) | j25) * (-575))) + (((~(j10 | 1057529672)) | (~(j | (-1057529673)))) * 575)) - 280138435;
                                                                    int i39 = (int) (j26 >> 32);
                                                                    int i40 = ((int) j26) & ((((((~(1864308415 | i28)) | 274776320) | r9) * (-502)) - 938467243) + (((~((-1712002731) | i3)) | (~(2139084735 | i28))) * 502));
                                                                    int i41 = (-16780417) | i28;
                                                                    if (((i39 & ((((~i41) | 1454006827) * (-828)) + 1754752898 + (i41 * (-828)) + 1009282560)) | i40) != 0) {
                                                                        break;
                                                                    }
                                                                    java.lang.Object[] objArr108 = new java.lang.Object[1];
                                                                    a(1431 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 14, objArr108);
                                                                    if (str12.equals(((java.lang.String) objArr108[0]).intern())) {
                                                                        java.lang.Object[] objArr109 = {str12};
                                                                        java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                        if (obj29 == null) {
                                                                            java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3162, (char) (android.text.TextUtils.indexOf(str10, str10, 0) + 33099));
                                                                            byte b42 = $$a[16];
                                                                            byte b43 = (byte) (b42 - 1);
                                                                            byte b44 = b42;
                                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                                            b(b43, b44, (short) (b44 | 40), objArr110);
                                                                            obj29 = cls26.getMethod((java.lang.String) objArr110[0], java.lang.String.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj29);
                                                                        }
                                                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr109)).longValue();
                                                                        long j27 = ~((~longValue11) | (-834071693));
                                                                        long j28 = (((-107) * longValue11) - 45873943115L) + (((~(j | longValue11)) | (~(834071692 | longValue11))) * (-108)) + (((~(j10 | 834071692)) | j27 | (~(j | (-834071693)))) * 54) + ((j10 | j27) * 54) + 1829506596;
                                                                        if (((((int) (j28 >> 32)) & (((((1448508011 | i28) * 1444) - 1153123274) + ((((~((-685675365) | i3)) | 5640800) | (~(2122901775 | i3))) * (-1444))) - 2145731736)) | (((int) j28) & (((155795493 | i3) * 614) + 1540478563 + (((~((-1368339738) | i28)) | android.R.layout.expandable_list_content | (~(1489401148 | i28))) * (-1228)) + (((~((-1350972697) | i28)) | (~(1506768189 | i28))) * 614)))) != 0) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    i18++;
                                                                }
                                                                if (i18 >= 0 && (i19 = i3 ^ (i18 + 130)) != i3) {
                                                                    java.lang.Object[] objArr111 = {new int[]{i3}, new int[]{i19}, null, null, new int[1]};
                                                                    java.lang.Object[] objArr112 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~((-171999651) | i3)) | (~((-1686397505) | i28))) * 920) + 763079801 + (((~((-192448944) | i28)) | 171999650) * 920) + (((~(i3 | (-20449294))) | (~(i28 | (-171999651))) | (~((-1686397505) | i3))) * 920))};
                                                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str10, str10, 0, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                                        byte[] bArr12 = $$a;
                                                                        byte b45 = bArr12[16];
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        b(b45, (byte) (-bArr12[18]), (short) (b45 - 1), objArr113);
                                                                        obj4 = cls27.getMethod((java.lang.String) objArr113[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr111[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr112)).intValue();
                                                                    return objArr111;
                                                                }
                                                            }
                                                            java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                            a(1509 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (26422 - android.text.TextUtils.getTrimmedLength(str10)), 14 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr114);
                                                            java.lang.String intern34 = ((java.lang.String) objArr114[0]).intern();
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1522, (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 5 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr115);
                                                            java.lang.String[] strArr10 = {intern34, ((java.lang.String) objArr115[0]).intern()};
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            a(android.os.Process.getGidForName(str10) + 1528, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27187), android.graphics.Color.green(0) + 15, objArr116);
                                                            java.lang.String intern35 = ((java.lang.String) objArr116[0]).intern();
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            a(android.graphics.Color.rgb(0, 0, 0) + 16778758, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 19 - android.graphics.Color.red(0), objArr117);
                                                            java.lang.String intern36 = ((java.lang.String) objArr117[0]).intern();
                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                            a(1561 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14364), 14 - android.graphics.Color.green(0), objArr118);
                                                            java.lang.String[] strArr11 = {intern35, intern36, ((java.lang.String) objArr118[0]).intern()};
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            a(1575 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (28614 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 21 - android.text.TextUtils.getCapsMode(str10, 0, 0), objArr119);
                                                            java.lang.String intern37 = ((java.lang.String) objArr119[0]).intern();
                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                            a(1595 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (53874 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.graphics.ImageFormat.getBitsPerPixel(0) + 11, objArr120);
                                                            java.lang.String[] strArr12 = {intern37, ((java.lang.String) objArr120[0]).intern()};
                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                            a(1605 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4072), 11 - (android.os.Process.myTid() >> 22), objArr121);
                                                            java.lang.String intern38 = ((java.lang.String) objArr121[0]).intern();
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            a(android.graphics.ImageFormat.getBitsPerPixel(0) + my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 19360), 6 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr122);
                                                            java.lang.String[] strArr13 = {intern38, ((java.lang.String) objArr122[0]).intern()};
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            a(1616 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, objArr123);
                                                            java.lang.String intern39 = ((java.lang.String) objArr123[0]).intern();
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            a(1596 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.MotionEvent.axisFromString(str10) + 53874), 10 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr124);
                                                            c = 0;
                                                            java.lang.String[][] strArr14 = {strArr10, strArr11, strArr12, strArr13, new java.lang.String[]{intern39, ((java.lang.String) objArr124[0]).intern()}};
                                                            int i42 = -1;
                                                            i15 = 0;
                                                            while (true) {
                                                                if (i15 < 5) {
                                                                    i16 = i3;
                                                                    break;
                                                                }
                                                                java.lang.String[] strArr15 = strArr14[i15];
                                                                java.lang.String str13 = strArr15[c];
                                                                java.lang.String[] strArr16 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr15, 1, strArr15.length);
                                                                int length = strArr16.length;
                                                                int i43 = 0;
                                                                while (i43 < length) {
                                                                    SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 57) % 128;
                                                                    int i44 = i42 + 1;
                                                                    java.lang.Object[] objArr125 = {str13, strArr16[i43]};
                                                                    java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1881343749);
                                                                    if (obj30 == null) {
                                                                        strArr2 = strArr14;
                                                                        java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 39, 2213 - android.view.View.resolveSizeAndState(0, 0, 0), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                        byte b46 = (byte) ($$b & 94);
                                                                        byte b47 = (byte) ($$a[16] - 1);
                                                                        strArr3 = strArr16;
                                                                        str6 = str13;
                                                                        java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                        b(b46, b47, (short) (b47 | 653), objArr126);
                                                                        obj30 = cls28.getMethod((java.lang.String) objArr126[0], java.lang.String.class, java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1881343749, obj30);
                                                                    } else {
                                                                        strArr2 = strArr14;
                                                                        strArr3 = strArr16;
                                                                        str6 = str13;
                                                                    }
                                                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr125)).longValue();
                                                                    long j29 = ~longValue12;
                                                                    int i45 = length;
                                                                    int i46 = i43;
                                                                    int i47 = i42;
                                                                    long j30 = (((((832 * longValue12) - 1055868568980L) + (((~((longValue12 | 1272130806) | j10)) | (~(j29 | j))) * (-831))) + ((~((1272130806 | j29) | j10)) * (-1662))) + ((((~(j | (-1272130807))) | (~(j10 | 1272130806))) | (~(longValue12 | j10))) * 831)) - 2007505408;
                                                                    if (((((int) j30) & ((((~((-16842834) | i28)) | (~((-1750227629) | i3))) * (-302)) + 470764003 + ((~((-16842834) | i3)) * (-604)) + (((~((-1767070462) | i3)) | (-2080071680)) * 302))) | (((int) (j30 >> 32)) & ((((~(754721273 | i28)) | (-754856954)) * 529) + 1520786966 + (((~(754721273 | i3)) | (-682505138)) * 529)))) != 0) {
                                                                        int i48 = SdkCoreAlternateContactlessPaymentDataImpl + 27;
                                                                        getProfileVersion = i48 % 128;
                                                                        i16 = i48 % 2 == 0 ? (i44 >>> 19062) ^ i3 : i3 ^ (i47 + 171);
                                                                    } else {
                                                                        i43 = i46 + 1;
                                                                        i42 = i44;
                                                                        strArr14 = strArr2;
                                                                        strArr16 = strArr3;
                                                                        str13 = str6;
                                                                        length = i45;
                                                                    }
                                                                }
                                                                i15++;
                                                                c = 0;
                                                            }
                                                            if (i16 == i3) {
                                                                java.lang.Object[] objArr127 = {new int[]{i3}, new int[]{i16}, null, null, new int[1]};
                                                                java.lang.Object[] objArr128 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((((~(301897098 | i28)) | (-2046746000)) * (-160)) - 69894831) + (((~(i28 | (-1748949000))) | 301897098) * 160))};
                                                                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj31 == null) {
                                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                                    byte[] bArr13 = $$a;
                                                                    byte b48 = bArr13[16];
                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                    b(b48, (byte) (-bArr13[18]), (short) (b48 - 1), objArr129);
                                                                    obj31 = cls29.getMethod((java.lang.String) objArr129[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                                }
                                                                ((int[]) objArr127[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr128)).intValue();
                                                                return objArr127;
                                                            }
                                                            try {
                                                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                a(android.view.KeyEvent.keyCodeFromString(str10) + 1645, (char) android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 14, objArr130);
                                                                java.lang.String intern40 = ((java.lang.String) objArr130[0]).intern();
                                                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                a(1658 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.KeyEvent.keyCodeFromString(str10), 8 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr131);
                                                                intern = ((java.lang.String) objArr131[0]).intern();
                                                                file = new java.io.File(intern40);
                                                            } catch (java.lang.Exception unused4) {
                                                                i17 = i3 ^ 151;
                                                            }
                                                            if (file.exists() && file.isFile()) {
                                                                try {
                                                                    java.util.Scanner scanner3 = new java.util.Scanner(new java.io.FileInputStream(file));
                                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                    a(android.text.TextUtils.indexOf(str10, str10, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, (char) (62316 - (android.os.Process.myPid() >> 22)), 2 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr132);
                                                                    java.util.Scanner useDelimiter3 = scanner3.useDelimiter(((java.lang.String) objArr132[0]).intern());
                                                                    next2 = useDelimiter3.hasNext() ? useDelimiter3.next() : str10;
                                                                    useDelimiter3.close();
                                                                } catch (java.io.IOException unused5) {
                                                                }
                                                                if (next2.contains(intern)) {
                                                                    i17 = i3 ^ 150;
                                                                    if (i17 == i3) {
                                                                        java.lang.Object[] objArr133 = {new int[]{i3}, new int[]{i17}, null, null, new int[1]};
                                                                        int i49 = ~(475910044 | i28);
                                                                        java.lang.Object[] objArr134 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((((~(1574936053 | i28)) | 16904) * (-1188)) - 1439686507) + (((~(i3 | (-1574936054))) | 16904 | i49) * 594) + (((~((-1574936054) | i28)) | 1099042913 | i49) * 594))};
                                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj32 == null) {
                                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                            byte[] bArr14 = $$a;
                                                                            byte b49 = bArr14[16];
                                                                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                            b(b49, (byte) (-bArr14[18]), (short) (b49 - 1), objArr135);
                                                                            obj32 = cls30.getMethod((java.lang.String) objArr135[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                                                                        }
                                                                        ((int[]) objArr133[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr134)).intValue();
                                                                        return objArr133;
                                                                    }
                                                                    java.lang.Object[] objArr136 = new java.lang.Object[1];
                                                                    a((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1666, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47, objArr136);
                                                                    java.lang.Object[] objArr137 = {((java.lang.String) objArr136[0]).intern()};
                                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                                    if (obj33 == null) {
                                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.graphics.Color.alpha(0), 3161 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (33100 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                                        byte b50 = (byte) ($$b & 94);
                                                                        byte b51 = (byte) ($$a[16] - 1);
                                                                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                                        b(b50, b51, (short) (b51 | 35), objArr138);
                                                                        obj33 = cls31.getMethod((java.lang.String) objArr138[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj33);
                                                                    }
                                                                    long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).longValue();
                                                                    long j31 = j | 648762970;
                                                                    long j32 = ((-518) * longValue13) + 336059218978L + (((~j31) | longValue13) * 519) + (((~(j31 | longValue13)) | (~((-648762971) | longValue13 | j10))) * (-519)) + (((~(longValue13 | j10)) | (-648762971)) * 519) + 1556233709;
                                                                    int i50 = ~((-6704161) | i28);
                                                                    int i51 = ~((-1194271621) | i3);
                                                                    int i52 = (((((int) (j32 >> 32)) & ((((((~((-1578676704) | i3)) | 1443930571) | i50) * (-470)) + 1479762012) + ((i50 | (~((-134746133) | i3))) * 470))) | (((((((~((-1194271621) | i28)) | 67707140) * (-245)) - 426532444) + (i51 * (-245))) + ((i51 | 1663469265) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)) & ((int) j32))) * 263) ^ i3;
                                                                    if (i52 != i3) {
                                                                        java.lang.Object[] objArr139 = {new int[]{i3}, new int[]{i52}, null, null, new int[1]};
                                                                        int i53 = ~(1058152951 | i28);
                                                                        java.lang.Object[] objArr140 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~(992693146 | i28)) | 68165733) * (-1188)) + 1030055431 + (((~(i3 | (-992693147))) | 68165733 | i53) * 594) + (((~((-992693147) | i28)) | 2705928 | i53) * 594))};
                                                                        java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                        if (obj34 == null) {
                                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                                                            byte[] bArr15 = $$a;
                                                                            byte b52 = bArr15[16];
                                                                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                                            b(b52, (byte) (-bArr15[18]), (short) (b52 - 1), objArr141);
                                                                            obj34 = cls32.getMethod((java.lang.String) objArr141[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                        }
                                                                        ((int[]) objArr139[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).intValue();
                                                                        return objArr139;
                                                                    }
                                                                    java.lang.Object[] objArr142 = {new int[]{i3}, new int[]{i3}, null, null, new int[1]};
                                                                    int i54 = ~(i3 | 2008771581);
                                                                    java.lang.Object[] objArr143 = {java.lang.Integer.valueOf(i5), num, java.lang.Integer.valueOf((((((~((-1384793054) | i28)) | 42074516) | i54) * (-252)) - 231277759) + ((i54 | (~(i28 | (-1342718538)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj35 == null) {
                                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, android.view.MotionEvent.axisFromString(str10) + 2714, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                                        byte[] bArr16 = $$a;
                                                                        byte b53 = bArr16[16];
                                                                        java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                                        b(b53, (byte) (-bArr16[18]), (short) (b53 - 1), objArr144);
                                                                        obj35 = cls33.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                                    }
                                                                    ((int[]) objArr142[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).intValue();
                                                                    return objArr142;
                                                                }
                                                            }
                                                            i17 = i3;
                                                            if (i17 == i3) {
                                                            }
                                                        }
                                                    }
                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                    a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + kotlin.io.encoding.Base64.padSymbol, (char) (20600 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 23 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr145);
                                                    java.lang.String intern41 = ((java.lang.String) objArr145[0]).intern();
                                                    java.lang.Object[] objArr146 = new java.lang.Object[1];
                                                    a(android.widget.ExpandableListView.getPackedPositionType(0L) + 371, (char) android.text.TextUtils.indexOf(str10, str10, 0, 0), 10 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr146);
                                                    java.lang.String intern42 = ((java.lang.String) objArr146[0]).intern();
                                                    java.lang.Object[] objArr147 = new java.lang.Object[1];
                                                    a(380 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5878), android.text.TextUtils.getCapsMode(str10, 0, 0) + 7, objArr147);
                                                    java.lang.String intern43 = ((java.lang.String) objArr147[0]).intern();
                                                    java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.getOffsetBefore(str10, 0) + 388, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 53147), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7, objArr148);
                                                    java.lang.String[] strArr17 = {intern41, intern42, intern43, ((java.lang.String) objArr148[0]).intern()};
                                                    java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                    a(396 - android.view.KeyEvent.normalizeMetaState(0), (char) (36677 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 17 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr149);
                                                    java.lang.String intern44 = ((java.lang.String) objArr149[0]).intern();
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    a(412 - android.view.MotionEvent.axisFromString(str10), (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 8143), 7 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr150);
                                                    java.lang.String intern45 = ((java.lang.String) objArr150[0]).intern();
                                                    java.lang.Object[] objArr151 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.getOffsetAfter(str10, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 51951), android.view.KeyEvent.keyCodeFromString(str10) + 7, objArr151);
                                                    java.lang.String intern46 = ((java.lang.String) objArr151[0]).intern();
                                                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                    a(android.graphics.ImageFormat.getBitsPerPixel(0) + 428, (char) (54029 - android.view.View.getDefaultSize(0, 0)), android.view.KeyEvent.getDeadChar(0, 0) + 11, objArr152);
                                                    java.lang.String intern47 = ((java.lang.String) objArr152[0]).intern();
                                                    java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                    a(438 - android.graphics.Color.blue(0), (char) (34215 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 15 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr153);
                                                    java.lang.String[] strArr18 = {intern44, intern45, intern46, intern47, ((java.lang.String) objArr153[0]).intern()};
                                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 452, (char) (27410 - android.view.KeyEvent.keyCodeFromString(str10)), 16 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr154);
                                                    java.lang.String intern48 = ((java.lang.String) objArr154[0]).intern();
                                                    java.lang.Object[] objArr155 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 467, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54823), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 4, objArr155);
                                                    java.lang.String intern49 = ((java.lang.String) objArr155[0]).intern();
                                                    java.lang.Object[] objArr156 = new java.lang.Object[1];
                                                    a(479 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.text.TextUtils.indexOf(str10, str10), 21 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr156);
                                                    java.lang.String intern50 = ((java.lang.String) objArr156[0]).intern();
                                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                    a(android.view.View.MeasureSpec.getSize(0) + androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 25 - android.graphics.Color.blue(0), objArr157);
                                                    java.lang.String intern51 = ((java.lang.String) objArr157[0]).intern();
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    a((android.view.KeyEvent.getMaxKeyCode() >> 16) + 526, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10042), 28 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr158);
                                                    java.lang.String[] strArr19 = {intern48, intern49, str4, intern50, intern51, ((java.lang.String) objArr158[0]).intern()};
                                                    java.lang.Object[] objArr159 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_WRONG_ACT_CODE, (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), 11 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr159);
                                                    java.lang.String intern52 = ((java.lang.String) objArr159[0]).intern();
                                                    java.lang.Object[] objArr160 = new java.lang.Object[1];
                                                    a(565 - android.view.View.MeasureSpec.getMode(0), (char) (271 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, objArr160);
                                                    java.lang.String intern53 = ((java.lang.String) objArr160[0]).intern();
                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 573, (char) android.text.TextUtils.getTrimmedLength(str10), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, objArr161);
                                                    java.lang.String intern54 = ((java.lang.String) objArr161[0]).intern();
                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getTouchSlop() >> 8) + 579, (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6, objArr162);
                                                    java.lang.String[] strArr20 = {intern52, intern53, intern54, ((java.lang.String) objArr162[0]).intern()};
                                                    java.lang.Object[] objArr163 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getTouchSlop() >> 8) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE, (char) android.text.TextUtils.indexOf(str10, str10, 0, 0), android.graphics.Color.alpha(0) + 16, objArr163);
                                                    java.lang.String intern55 = ((java.lang.String) objArr163[0]).intern();
                                                    java.lang.Object[] objArr164 = new java.lang.Object[1];
                                                    a(android.graphics.Color.alpha(0) + androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, (char) (51951 - android.text.TextUtils.getOffsetBefore(str10, 0)), 7 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr164);
                                                    java.lang.String intern56 = ((java.lang.String) objArr164[0]).intern();
                                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                    a(388 - android.view.View.MeasureSpec.getSize(0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 53146), android.view.View.combineMeasuredStates(0, 0) + 8, objArr165);
                                                    java.lang.String[] strArr21 = {intern55, intern56, ((java.lang.String) objArr165[0]).intern()};
                                                    java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                    a((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 600, (char) (16595 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), android.view.View.combineMeasuredStates(0, 0) + 14, objArr166);
                                                    java.lang.String intern57 = ((java.lang.String) objArr166[0]).intern();
                                                    java.lang.Object[] objArr167 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 614, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31117), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr167);
                                                    java.lang.String[] strArr22 = {intern57, ((java.lang.String) objArr167[0]).intern()};
                                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 617, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr168);
                                                    java.lang.String intern58 = ((java.lang.String) objArr168[0]).intern();
                                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                    a(android.view.View.MeasureSpec.getMode(0) + 625, (char) android.view.KeyEvent.normalizeMetaState(0), 1 - android.view.KeyEvent.normalizeMetaState(0), objArr169);
                                                    java.lang.String[] strArr23 = {intern58, ((java.lang.String) objArr169[0]).intern()};
                                                    java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                    a(625 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.getTrimmedLength(str10), android.view.View.resolveSizeAndState(0, 0, 0) + 16, objArr170);
                                                    java.lang.String intern59 = ((java.lang.String) objArr170[0]).intern();
                                                    java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                    a(android.graphics.Color.blue(0) + 468, (char) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 54824), 3 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr171);
                                                    java.lang.String intern60 = ((java.lang.String) objArr171[0]).intern();
                                                    java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 412, (char) ((android.os.Process.myTid() >> 22) + 8142), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 7, objArr172);
                                                    java.lang.String intern61 = ((java.lang.String) objArr172[0]).intern();
                                                    java.lang.Object[] objArr173 = new java.lang.Object[1];
                                                    a(android.graphics.ImageFormat.getBitsPerPixel(0) + 643, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 55198), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 8, objArr173);
                                                    java.lang.String intern62 = ((java.lang.String) objArr173[0]).intern();
                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                    a(427 - (android.os.Process.myTid() >> 22), (char) (54029 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 11 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr174);
                                                    java.lang.String intern63 = ((java.lang.String) objArr174[0]).intern();
                                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                    a(android.graphics.ImageFormat.getBitsPerPixel(0) + 439, (char) (34216 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, objArr175);
                                                    java.lang.String[] strArr24 = {intern59, intern60, intern61, intern62, intern63, ((java.lang.String) objArr175[0]).intern()};
                                                    java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 649, (char) (android.graphics.Color.red(0) + 14046), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19, objArr176);
                                                    java.lang.String intern64 = ((java.lang.String) objArr176[0]).intern();
                                                    java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getTapTimeout() >> 16) + 670, (char) android.view.View.combineMeasuredStates(0, 0), android.view.View.MeasureSpec.getSize(0) + 19, objArr177);
                                                    java.lang.String intern65 = ((java.lang.String) objArr177[0]).intern();
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 688, (char) (21231 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 32 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr178);
                                                    java.lang.String intern66 = ((java.lang.String) objArr178[0]).intern();
                                                    java.lang.Object[] objArr179 = new java.lang.Object[1];
                                                    a(android.widget.ExpandableListView.getPackedPositionChild(0L) + 721, (char) (27223 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, objArr179);
                                                    java.lang.String intern67 = ((java.lang.String) objArr179[0]).intern();
                                                    java.lang.Object[] objArr180 = new java.lang.Object[1];
                                                    a(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 746, (char) (android.view.View.resolveSize(0, 0) + 27639), 23 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr180);
                                                    java.lang.String intern68 = ((java.lang.String) objArr180[0]).intern();
                                                    java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                    a(769 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.text.TextUtils.getOffsetAfter(str10, 0), 33 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr181);
                                                    java.lang.String[] strArr25 = {intern64, intern65, intern66, intern67, intern68, ((java.lang.String) objArr181[0]).intern(), str4};
                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                    a(android.view.View.combineMeasuredStates(0, 0) + 802, (char) (36190 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), 13 - android.view.KeyEvent.getDeadChar(0, 0), objArr182);
                                                    java.lang.String intern69 = ((java.lang.String) objArr182[0]).intern();
                                                    java.lang.Object[] objArr183 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.getCapsMode(str10, 0, 0) + 381, (char) (5879 - android.text.TextUtils.getTrimmedLength(str10)), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8, objArr183);
                                                    java.lang.String[] strArr26 = {intern69, ((java.lang.String) objArr183[0]).intern()};
                                                    java.lang.Object[] objArr184 = new java.lang.Object[1];
                                                    a(815 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 29 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr184);
                                                    java.lang.String intern70 = ((java.lang.String) objArr184[0]).intern();
                                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                    a(845 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.getCapsMode(str10, 0, 0) + 59184), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 12, objArr185);
                                                    java.lang.String[] strArr27 = {intern70, ((java.lang.String) objArr185[0]).intern()};
                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                    a(857 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 51708), 19 - android.text.TextUtils.getOffsetBefore(str10, 0), objArr186);
                                                    java.lang.String intern71 = ((java.lang.String) objArr186[0]).intern();
                                                    java.lang.Object[] objArr187 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 875, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 5 - android.view.View.combineMeasuredStates(0, 0), objArr187);
                                                    java.lang.String[] strArr28 = {intern71, ((java.lang.String) objArr187[0]).intern()};
                                                    java.lang.Object[] objArr188 = new java.lang.Object[1];
                                                    a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 880, (char) ((-1) - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 19 - android.view.View.MeasureSpec.getMode(0), objArr188);
                                                    java.lang.String[] strArr29 = {((java.lang.String) objArr188[0]).intern()};
                                                    java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                    a(898 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 16 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr189);
                                                    java.lang.String[] strArr30 = {((java.lang.String) objArr189[0]).intern()};
                                                    java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                    a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 915, (char) (32354 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 19 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr190);
                                                    java.lang.String[] strArr31 = {((java.lang.String) objArr190[0]).intern()};
                                                    java.lang.Object[] objArr191 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 934, (char) android.view.View.MeasureSpec.getMode(0), 18 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr191);
                                                    java.lang.String[] strArr32 = {((java.lang.String) objArr191[0]).intern()};
                                                    java.lang.Object[] objArr192 = new java.lang.Object[1];
                                                    a(953 - (android.os.Process.myPid() >> 22), (char) (21765 - android.text.TextUtils.getOffsetAfter(str10, 0)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24, objArr192);
                                                    java.lang.String[] strArr33 = {((java.lang.String) objArr192[0]).intern()};
                                                    java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 976, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35607), android.view.View.MeasureSpec.getMode(0) + 21, objArr193);
                                                    java.lang.String[] strArr34 = {((java.lang.String) objArr193[0]).intern()};
                                                    java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                    a(998 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 48929), android.graphics.Color.blue(0) + 24, objArr194);
                                                    java.lang.String str14 = str4;
                                                    java.lang.String[] strArr35 = {((java.lang.String) objArr194[0]).intern(), str14};
                                                    java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                    a(1021 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 28, objArr195);
                                                    java.lang.String[] strArr36 = {((java.lang.String) objArr195[0]).intern(), str14};
                                                    java.lang.Object[] objArr196 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ALTITUDE, (char) (android.os.Process.myTid() >> 22), 27 - android.text.TextUtils.indexOf(str10, str10), objArr196);
                                                    char c2 = 0;
                                                    java.lang.String[] strArr37 = {((java.lang.String) objArr196[0]).intern(), str14};
                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                    a(android.graphics.Color.argb(0, 0, 0, 0) + 1076, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 31 - android.text.TextUtils.getOffsetBefore(str10, 0), objArr197);
                                                    java.lang.String[] strArr38 = {((java.lang.String) objArr197[0]).intern(), str14};
                                                    java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                    a(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 1107, (char) (61906 - android.view.View.resolveSizeAndState(0, 0, 0)), 27 - (android.os.Process.myPid() >> 22), objArr198);
                                                    java.lang.String[] strArr39 = {((java.lang.String) objArr198[0]).intern(), str14};
                                                    java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                    a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1133, (char) android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 32, objArr199);
                                                    java.lang.String[][] strArr40 = {strArr17, strArr18, strArr19, strArr20, strArr21, strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, new java.lang.String[]{((java.lang.String) objArr199[0]).intern(), str14}};
                                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                                    int i55 = i3;
                                                    int i56 = 0;
                                                    int i57 = 0;
                                                    while (i56 < 24) {
                                                        java.lang.String[] strArr41 = strArr40[i56];
                                                        java.lang.Object[] objArr200 = {strArr41[c2]};
                                                        java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                        if (obj36 == null) {
                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString(str10) + 41, 1921 - android.view.View.resolveSize(0, 0), (char) android.graphics.Color.blue(0));
                                                            byte b54 = (byte) ($$b & 94);
                                                            byte b55 = (byte) ($$a[16] - 1);
                                                            strArr = strArr40;
                                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                            b(b54, b55, (short) (b55 | 653), objArr201);
                                                            obj36 = cls34.getMethod((java.lang.String) objArr201[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj36);
                                                        } else {
                                                            strArr = strArr40;
                                                        }
                                                        java.lang.String str15 = (java.lang.String) ((java.lang.reflect.Method) obj36).invoke(null, objArr200);
                                                        java.lang.String[] strArr42 = (java.lang.String[]) java.util.Arrays.copyOfRange(strArr41, 1, strArr41.length);
                                                        if (str15 == null || str15.length() == 0) {
                                                            arrayList3 = arrayList5;
                                                        } else {
                                                            if (strArr41.length != 1) {
                                                                java.lang.Object[] objArr202 = {str15, strArr42};
                                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                                if (obj37 == null) {
                                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2880, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                                    byte b56 = (byte) ($$b & 94);
                                                                    byte b57 = (byte) ($$a[16] - 1);
                                                                    java.lang.Object[] objArr203 = new java.lang.Object[1];
                                                                    b(b56, b57, (short) (b57 | 653), objArr203);
                                                                    obj37 = cls35.getMethod((java.lang.String) objArr203[0], java.lang.String.class, java.lang.String[].class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj37);
                                                                }
                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, objArr202)).longValue();
                                                                arrayList4 = arrayList5;
                                                                long j33 = ((((((-159) * longValue14) + 84705154062L) + ((532736817 | longValue14) * 160)) + (((~(longValue14 | (-532736818))) | (~(j | (-532736818)))) * (-160))) + (((~((~longValue14) | j)) | (-532736818)) * 160)) - 1495974961;
                                                                if (((((int) (j33 >> 32)) & ((((1227410350 | i3) * (-859)) - 622606864) + (((~(1227410350 | i28)) | (~((-134252973) | i3))) * 859) + (((~((-209816061) | i28)) | 75563088) * 859))) | (((int) j33) & ((((~((-39193699) | i3)) | (~((-1476420109) | i28))) * (-318)) + 75022327 + (((~(123145699 | i3)) | (-1599565808)) * (-318)) + (((~((-123145700) | i3)) | 1560372109) * 318)))) == 0) {
                                                                    arrayList3 = arrayList4;
                                                                }
                                                            } else {
                                                                arrayList4 = arrayList5;
                                                            }
                                                            i57++;
                                                            i55 = i3 ^ (i56 + 10);
                                                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                            sb3.append(str15);
                                                            java.lang.Object[] objArr204 = new java.lang.Object[1];
                                                            a((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1165, (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7206), 1 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr204);
                                                            sb3.append(((java.lang.String) objArr204[0]).intern());
                                                            sb3.append(str15);
                                                            java.lang.String obj38 = sb3.toString();
                                                            arrayList3 = arrayList4;
                                                            arrayList3.add(obj38);
                                                        }
                                                        i56++;
                                                        arrayList5 = arrayList3;
                                                        strArr40 = strArr;
                                                        c2 = 0;
                                                    }
                                                    java.util.ArrayList arrayList6 = arrayList5;
                                                    if (i57 > 2) {
                                                        objArr3 = new java.lang.Object[]{new int[]{i3}, new int[]{i55}, arrayList6, null, new int[1]};
                                                        java.lang.Object[] objArr205 = {num, num, java.lang.Integer.valueOf(((((~((-1705879010) | i28)) | (~(344967088 | i3))) * 959) - 1688594495) + (((~((-1705879010) | i3)) | (~(344967088 | i28))) * 959))};
                                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj39 == null) {
                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2714 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                                            byte[] bArr17 = $$a;
                                                            byte b58 = bArr17[16];
                                                            java.lang.Object[] objArr206 = new java.lang.Object[1];
                                                            b(b58, (byte) (-bArr17[18]), (short) (b58 - 1), objArr206);
                                                            obj39 = cls36.getMethod((java.lang.String) objArr206[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                        }
                                                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr205)).intValue();
                                                        i12 = 0;
                                                        ((int[]) objArr3[4])[0] = intValue;
                                                    } else {
                                                        objArr3 = new java.lang.Object[]{new int[]{i3}, new int[]{i3}, null, null, new int[1]};
                                                        java.lang.Object[] objArr207 = {num, num, java.lang.Integer.valueOf((((~((-424665863) | i28)) | 1626180235) * (-602)) + 734209661 + (((~((-424665863) | i3)) | 5079554 | (~(2045766543 | i28))) * (-301)) + ((~(1626180235 | i28)) * 301))};
                                                        java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj40 == null) {
                                                            java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                            byte[] bArr18 = $$a;
                                                            byte b59 = bArr18[16];
                                                            java.lang.Object[] objArr208 = new java.lang.Object[1];
                                                            b(b59, (byte) (-bArr18[18]), (short) (b59 - 1), objArr208);
                                                            obj40 = cls37.getMethod((java.lang.String) objArr208[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                                        }
                                                        int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr207)).intValue();
                                                        i12 = 0;
                                                        ((int[]) objArr3[4])[0] = intValue2;
                                                    }
                                                    int i58 = ((int[]) objArr3[1])[i12];
                                                    if (i58 != i3) {
                                                        int[] iArr = new int[1];
                                                        int[] iArr2 = new int[1];
                                                        java.util.List list2 = (java.util.List) objArr3[2];
                                                        iArr[i12] = i3;
                                                        iArr2[i12] = i58;
                                                        java.lang.Object[] objArr209 = {iArr, iArr2, list2, null, new int[1]};
                                                        java.lang.Object[] objArr210 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf(((((-1369721097) | i3) * (-676)) - 1004464363) + (((~(676897349 | i28)) | 1369721096) * 676) + (((~(i3 | 2046618445)) | (~(i28 | (-1373948749))) | 4227652) * 676))};
                                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj41 == null) {
                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str10, 0) + 50, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 2713, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                            byte[] bArr19 = $$a;
                                                            byte b60 = bArr19[16];
                                                            java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                            b(b60, (byte) (-bArr19[18]), (short) (b60 - 1), objArr211);
                                                            obj41 = cls38.getMethod((java.lang.String) objArr211[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                        }
                                                        ((int[]) objArr209[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr210)).intValue();
                                                        return objArr209;
                                                    }
                                                    i13 = i12;
                                                    java.lang.Object[] objArr822 = new java.lang.Object[1];
                                                    a(android.view.KeyEvent.normalizeMetaState(i13) + 452, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 27410), (android.widget.ExpandableListView.getPackedPositionForChild(i13, i13) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i13, i13) == 0L ? 0 : -1)) + 17, objArr822);
                                                    java.lang.Object[] objArr832 = {((java.lang.String) objArr822[i13]).intern()};
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj3 == null) {
                                                    }
                                                    invoke = ((java.lang.reflect.Method) obj3).invoke(null, objArr832);
                                                    if (invoke != null) {
                                                    }
                                                    if (i14 != 1986687685) {
                                                        java.lang.Object[] objArr872 = new java.lang.Object[1];
                                                        a((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1166, (char) android.view.View.getDefaultSize(0, 0), 14 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr872);
                                                        java.lang.String intern162 = ((java.lang.String) objArr872[0]).intern();
                                                        java.lang.Object[] objArr882 = new java.lang.Object[1];
                                                        a(android.graphics.Color.green(0) + 1181, (char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 27, objArr882);
                                                        java.lang.String intern172 = ((java.lang.String) objArr882[0]).intern();
                                                        java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                        a((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1207, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 39197), 16 - android.os.Process.getGidForName(str10), objArr892);
                                                        java.lang.String intern182 = ((java.lang.String) objArr892[0]).intern();
                                                        java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                        a(android.text.TextUtils.indexOf(str10, str10, 0, 0) + 1224, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - android.view.View.getDefaultSize(0, 0), objArr902);
                                                        java.lang.String intern192 = ((java.lang.String) objArr902[0]).intern();
                                                        java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                        a(1241 - android.text.TextUtils.getCapsMode(str10, 0, 0), (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 11810), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 15, objArr912);
                                                        java.lang.String intern202 = ((java.lang.String) objArr912[0]).intern();
                                                        java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                        a(1256 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 20541), 37 - android.graphics.Color.green(0), objArr922);
                                                        java.lang.String intern212 = ((java.lang.String) objArr922[0]).intern();
                                                        java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1293, (char) android.text.TextUtils.getOffsetAfter(str10, 0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr932);
                                                        java.lang.String intern222 = ((java.lang.String) objArr932[0]).intern();
                                                        java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                        a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1304, (char) (android.view.View.getDefaultSize(0, 0) + 32709), 13 - android.text.TextUtils.indexOf(str10, str10, 0), objArr942);
                                                        java.lang.String intern232 = ((java.lang.String) objArr942[0]).intern();
                                                        java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                        a(1318 - android.view.KeyEvent.keyCodeFromString(str10), (char) (25069 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr952);
                                                        java.lang.String intern242 = ((java.lang.String) objArr952[0]).intern();
                                                        java.lang.Object[] objArr962 = new java.lang.Object[1];
                                                        a(android.view.View.getDefaultSize(0, 0) + 1340, (char) (44149 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), 31 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr962);
                                                        java.lang.String intern252 = ((java.lang.String) objArr962[0]).intern();
                                                        java.lang.Object[] objArr972 = new java.lang.Object[1];
                                                        a(1370 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (42428 - android.text.TextUtils.getOffsetBefore(str10, 0)), android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, objArr972);
                                                        java.lang.String intern262 = ((java.lang.String) objArr972[0]).intern();
                                                        java.lang.Object[] objArr982 = new java.lang.Object[1];
                                                        a(android.view.MotionEvent.axisFromString(str10) + 1384, (char) (24481 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr982);
                                                        java.lang.String intern272 = ((java.lang.String) objArr982[0]).intern();
                                                        java.lang.Object[] objArr992 = new java.lang.Object[1];
                                                        a(1395 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 52622), 12 - android.graphics.Color.alpha(0), objArr992);
                                                        java.lang.String intern282 = ((java.lang.String) objArr992[0]).intern();
                                                        java.lang.Object[] objArr1002 = new java.lang.Object[1];
                                                        a(1407 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 12 - android.view.View.MeasureSpec.getSize(0), objArr1002);
                                                        java.lang.String intern292 = ((java.lang.String) objArr1002[0]).intern();
                                                        java.lang.Object[] objArr1012 = new java.lang.Object[1];
                                                        a(android.view.View.MeasureSpec.getSize(0) + 1419, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 12 - android.view.View.getDefaultSize(0, 0), objArr1012);
                                                        java.lang.String intern302 = ((java.lang.String) objArr1012[0]).intern();
                                                        java.lang.Object[] objArr1022 = new java.lang.Object[1];
                                                        a(1432 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.View.getDefaultSize(0, 0) + 14, objArr1022);
                                                        java.lang.String intern312 = ((java.lang.String) objArr1022[0]).intern();
                                                        java.lang.Object[] objArr1032 = new java.lang.Object[1];
                                                        a(android.view.View.getDefaultSize(0, 0) + 1445, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 17597), android.text.TextUtils.getTrimmedLength(str10) + 12, objArr1032);
                                                        java.lang.String intern322 = ((java.lang.String) objArr1032[0]).intern();
                                                        java.lang.Object[] objArr1042 = new java.lang.Object[1];
                                                        a(1457 - android.graphics.Color.alpha(0), (char) (android.view.View.combineMeasuredStates(0, 0) + 10515), 24 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr1042);
                                                        java.lang.String intern332 = ((java.lang.String) objArr1042[0]).intern();
                                                        java.lang.Object[] objArr1052 = new java.lang.Object[1];
                                                        a((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1481, (char) (22697 - android.text.TextUtils.getOffsetBefore(str10, 0)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 28, objArr1052);
                                                        java.lang.String[] strArr92 = {intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, intern292, intern302, intern312, intern322, intern332, ((java.lang.String) objArr1052[0]).intern()};
                                                        i18 = 0;
                                                        while (true) {
                                                            if (i18 < 19) {
                                                            }
                                                            i18++;
                                                        }
                                                        if (i18 >= 0) {
                                                            java.lang.Object[] objArr1112 = {new int[]{i3}, new int[]{i19}, null, null, new int[1]};
                                                            java.lang.Object[] objArr1122 = {java.lang.Integer.valueOf(i5), num2, java.lang.Integer.valueOf((((~((-171999651) | i3)) | (~((-1686397505) | i28))) * 920) + 763079801 + (((~((-192448944) | i28)) | 171999650) * 920) + (((~(i3 | (-20449294))) | (~(i28 | (-171999651))) | (~((-1686397505) | i3))) * 920))};
                                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj4 == null) {
                                                            }
                                                            ((int[]) objArr1112[4])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr1122)).intValue();
                                                            return objArr1112;
                                                        }
                                                    }
                                                    java.lang.Object[] objArr1142 = new java.lang.Object[1];
                                                    a(1509 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (26422 - android.text.TextUtils.getTrimmedLength(str10)), 14 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr1142);
                                                    java.lang.String intern342 = ((java.lang.String) objArr1142[0]).intern();
                                                    java.lang.Object[] objArr1152 = new java.lang.Object[1];
                                                    a((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1522, (char) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), 5 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1152);
                                                    java.lang.String[] strArr102 = {intern342, ((java.lang.String) objArr1152[0]).intern()};
                                                    java.lang.Object[] objArr1162 = new java.lang.Object[1];
                                                    a(android.os.Process.getGidForName(str10) + 1528, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27187), android.graphics.Color.green(0) + 15, objArr1162);
                                                    java.lang.String intern352 = ((java.lang.String) objArr1162[0]).intern();
                                                    java.lang.Object[] objArr1172 = new java.lang.Object[1];
                                                    a(android.graphics.Color.rgb(0, 0, 0) + 16778758, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 19 - android.graphics.Color.red(0), objArr1172);
                                                    java.lang.String intern362 = ((java.lang.String) objArr1172[0]).intern();
                                                    java.lang.Object[] objArr1182 = new java.lang.Object[1];
                                                    a(1561 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 14364), 14 - android.graphics.Color.green(0), objArr1182);
                                                    java.lang.String[] strArr112 = {intern352, intern362, ((java.lang.String) objArr1182[0]).intern()};
                                                    java.lang.Object[] objArr1192 = new java.lang.Object[1];
                                                    a(1575 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (28614 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), 21 - android.text.TextUtils.getCapsMode(str10, 0, 0), objArr1192);
                                                    java.lang.String intern372 = ((java.lang.String) objArr1192[0]).intern();
                                                    java.lang.Object[] objArr1202 = new java.lang.Object[1];
                                                    a(1595 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (53874 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), android.graphics.ImageFormat.getBitsPerPixel(0) + 11, objArr1202);
                                                    java.lang.String[] strArr122 = {intern372, ((java.lang.String) objArr1202[0]).intern()};
                                                    java.lang.Object[] objArr1212 = new java.lang.Object[1];
                                                    a(1605 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 4072), 11 - (android.os.Process.myTid() >> 22), objArr1212);
                                                    java.lang.String intern382 = ((java.lang.String) objArr1212[0]).intern();
                                                    java.lang.Object[] objArr1222 = new java.lang.Object[1];
                                                    a(android.graphics.ImageFormat.getBitsPerPixel(0) + my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD, (char) (android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 19360), 6 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1222);
                                                    java.lang.String[] strArr132 = {intern382, ((java.lang.String) objArr1222[0]).intern()};
                                                    java.lang.Object[] objArr1232 = new java.lang.Object[1];
                                                    a(1616 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27, objArr1232);
                                                    java.lang.String intern392 = ((java.lang.String) objArr1232[0]).intern();
                                                    java.lang.Object[] objArr1242 = new java.lang.Object[1];
                                                    a(1596 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.MotionEvent.axisFromString(str10) + 53874), 10 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1242);
                                                    c = 0;
                                                    java.lang.String[][] strArr142 = {strArr102, strArr112, strArr122, strArr132, new java.lang.String[]{intern392, ((java.lang.String) objArr1242[0]).intern()}};
                                                    int i422 = -1;
                                                    i15 = 0;
                                                    while (true) {
                                                        if (i15 < 5) {
                                                        }
                                                        i15++;
                                                        c = 0;
                                                    }
                                                    if (i16 == i3) {
                                                    }
                                                }
                                            }
                                            j = j11;
                                            java.lang.Object[] objArr212 = new java.lang.Object[1];
                                            a(350 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28936), 14 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr212);
                                            java.lang.String intern72 = ((java.lang.String) objArr212[0]).intern();
                                            java.lang.Object[] objArr213 = new java.lang.Object[1];
                                            a(android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 363, (char) (769 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 9 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr213);
                                            java.lang.String intern73 = ((java.lang.String) objArr213[0]).intern();
                                            java.io.File file4 = new java.io.File(intern72);
                                            if (file4.exists() && file4.isFile()) {
                                                try {
                                                    java.util.Scanner scanner4 = new java.util.Scanner(new java.io.FileInputStream(file4));
                                                    java.lang.Object[] objArr214 = new java.lang.Object[1];
                                                    a((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, (char) (62316 - android.text.TextUtils.getCapsMode(str10, 0, 0)), 2 - android.view.View.getDefaultSize(0, 0), objArr214);
                                                    java.util.Scanner useDelimiter4 = scanner4.useDelimiter(((java.lang.String) objArr214[0]).intern());
                                                    next = useDelimiter4.hasNext() ? useDelimiter4.next() : str10;
                                                    useDelimiter4.close();
                                                } catch (java.io.IOException unused6) {
                                                }
                                                if (next.contains(intern73)) {
                                                    i11 = i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE;
                                                    if (i11 != i3) {
                                                    }
                                                }
                                            }
                                            i11 = i3;
                                            if (i11 != i3) {
                                            }
                                        }
                                    }
                                    i10 = i3;
                                    if (i10 == i3) {
                                    }
                                }
                            }
                        }
                        i8 = i3;
                        if (i8 == i3) {
                        }
                    }

                    static void init$1() {
                        $$d = new byte[]{82, -59, -67, 97};
                        $$e = 108;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final int getProfileVersion() {
                        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1976342074, 1976342075, java.lang.System.identityHashCode(this))).intValue();
                    }

                    static void init$0() {
                        $$a = new byte[]{Byte.MAX_VALUE, -61, 58, -113, com.google.common.base.Ascii.SI, -10, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
                        $$b = 179;
                    }

                    @Override // com.payair.hce.isNetworkError
                    public final byte[] getAid() {
                        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 949008336, -949008336, java.lang.System.identityHashCode(this));
                    }
                };
                arrayList2.add(new com.payair.hce.RequestCompleteTokenizeDtoPlatform() { // from class: com.payair.hce.getMainLooper.5
                    private static int RecordsJson = 1;
                    private static int SdkCoreAlternateContactlessPaymentDataImpl;

                    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3, int i3, int i4, int i5) {
                        int i6 = ~i4;
                        int i7 = ~(i5 | i4);
                        int i8 = (i3 * (-391)) + (i4 * (-195)) + (((~(i6 | i3)) | i7) * (-196)) + ((i4 | i3) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY) + (((~((~i3) | i6)) | i7) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
                        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? AlternateContactlessPaymentDataJson(objArr3) : DigitizedCardProfile(objArr3) : valueOf(objArr3) : writeReplace(objArr3) : values(objArr3);
                    }

                    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr3) {
                        com.payair.hce.getMainLooper.AnonymousClass5 anonymousClass5 = (com.payair.hce.getMainLooper.AnonymousClass5) objArr3[0];
                        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 9;
                        RecordsJson = i3 % 128;
                        java.lang.String str4 = obj2;
                        if (i3 % 2 != 0) {
                            return str4;
                        }
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr3) {
                        int i3 = RecordsJson;
                        int i4 = i3 & 89;
                        int i5 = i3 | 89;
                        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                        SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
                        int i7 = i6 % 2;
                        com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace writereplace = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf;
                        if (i7 != 0) {
                            writereplace.DigitizedCardProfile();
                            throw null;
                        }
                        int DigitizedCardProfile2 = writereplace.DigitizedCardProfile();
                        int i8 = RecordsJson;
                        SdkCoreAlternateContactlessPaymentDataImpl = (((i8 ^ 25) - (~(-(-((i8 & 25) << 1))))) - 1) % 128;
                        return java.lang.Integer.valueOf(DigitizedCardProfile2);
                    }

                    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr3) {
                        com.payair.hce.getMainLooper.AnonymousClass5 anonymousClass5 = (com.payair.hce.getMainLooper.AnonymousClass5) objArr3[0];
                        int i3 = RecordsJson;
                        int i4 = (i3 & 73) + (i3 | 73);
                        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
                        com.payair.hce.isNetworkError isnetworkerror3 = isnetworkerror2;
                        if (i4 % 2 == 0) {
                            return java.lang.Integer.valueOf(isnetworkerror3.getProfileVersion());
                        }
                        isnetworkerror3.getProfileVersion();
                        throw null;
                    }

                    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr3) {
                        com.payair.hce.getMainLooper.AnonymousClass5 anonymousClass5 = (com.payair.hce.getMainLooper.AnonymousClass5) objArr3[0];
                        int i3 = RecordsJson;
                        int i4 = (i3 ^ 73) + ((i3 & 73) << 1);
                        int i5 = i4 % 128;
                        SdkCoreAlternateContactlessPaymentDataImpl = i5;
                        java.lang.String str4 = DigitizedCardProfile;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        int i6 = (i5 | 105) << 1;
                        int i7 = -(i5 ^ 105);
                        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                        RecordsJson = i8 % 128;
                        if (i8 % 2 != 0) {
                            return str4;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr3) {
                        com.payair.hce.getMainLooper.AnonymousClass5 anonymousClass5 = (com.payair.hce.getMainLooper.AnonymousClass5) objArr3[0];
                        int i3 = SdkCoreAlternateContactlessPaymentDataImpl;
                        int i4 = i3 & 53;
                        int i5 = (i3 | 53) & (~i4);
                        int i6 = -(-(i4 << 1));
                        RecordsJson = ((i5 & i6) + (i5 | i6)) % 128;
                        byte[] bArr = (byte[]) com.payair.hce.getAssets.DigitizedCardProfile(new java.lang.Object[]{isnetworkerror2}, 145909445, -145909443, (int) java.lang.System.currentTimeMillis());
                        int i7 = RecordsJson;
                        int i8 = i7 & 103;
                        int i9 = -(-(i7 | 103));
                        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
                        SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
                        if (i10 % 2 == 0) {
                            return bArr;
                        }
                        throw new java.lang.ArithmeticException();
                    }

                    @Override // com.payair.hce.RequestCompleteTokenizeDtoPlatform
                    public final byte[] valueOf() {
                        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this}, -1382695758, 1382695760, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.RequestCompleteTokenizeDtoPlatform
                    public final java.lang.String AlternateContactlessPaymentDataJson() {
                        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1298487851, 1298487851, java.lang.System.identityHashCode(this));
                    }

                    @Override // com.payair.hce.RequestCompleteTokenizeDtoPlatform
                    public final int writeReplace() {
                        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1399916228, -1399916227, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.RequestCompleteTokenizeDtoPlatform
                    public final int values() {
                        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 383697602, -383697598, java.lang.System.identityHashCode(this))).intValue();
                    }

                    @Override // com.payair.hce.RequestCompleteTokenizeDtoPlatform
                    public final java.lang.String DigitizedCardProfile() {
                        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1768364849, -1768364846, java.lang.System.identityHashCode(this));
                    }
                });
                int i3 = getPaymentFci + 111;
                RecordsJson = i3 % 128;
                int i4 = i3 % 2;
            }
            this.values.values(str, arrayList, this.values.AlternateContactlessPaymentDataJson(str), arrayList2);
        }
        this.DigitizedCardProfile.DigitizedCardProfile(str, list.size());
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Exception exc) {
        getPaymentFci = (RecordsJson + 57) % 128;
        this.DigitizedCardProfile.valueOf(str, str3, str4, exc);
        int i = getPaymentFci + 23;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Exception exc) {
        getPaymentFci = (RecordsJson + 31) % 128;
        this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(str, str3, str4, exc);
        RecordsJson = (getPaymentFci + 67) % 128;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(java.lang.String str) {
        int i = RecordsJson + 69;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.DigitizedCardProfile.getAid(str);
            RecordsJson = (getPaymentFci + 41) % 128;
        } else {
            this.DigitizedCardProfile.getAid(str);
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void writeReplace(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        int i = RecordsJson + 65;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.DigitizedCardProfile.valueOf(str, str2, exc);
            int i2 = RecordsJson + 61;
            getPaymentFci = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.DigitizedCardProfile.valueOf(str, str2, exc);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        RecordsJson = (getPaymentFci + 11) % 128;
        this.DigitizedCardProfile.values(str, str2, exc);
        getPaymentFci = (RecordsJson + 29) % 128;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getMainLooper getmainlooper = (com.payair.hce.getMainLooper) objArr[0];
        RecordsJson = (getPaymentFci + 61) % 128;
        getmainlooper.DigitizedCardProfile.values();
        int i = getPaymentFci + 121;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        getPaymentFci = (RecordsJson + 41) % 128;
        getProfileVersion(str);
        this.DigitizedCardProfile.SdkCoreAlternateContactlessPaymentDataImpl(str);
        int i = getPaymentFci + 13;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void IccPrivateKeyCrtComponentsJson() {
        int i = getPaymentFci + 37;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            getProfileVersion();
            this.DigitizedCardProfile.writeReplace();
        } else {
            getProfileVersion();
            this.DigitizedCardProfile.writeReplace();
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void RecordsJson() {
        getPaymentFci = (RecordsJson + 83) % 128;
        this.DigitizedCardProfile.valueOf();
        RecordsJson = (getPaymentFci + 19) % 128;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.getMainLooper getmainlooper = (com.payair.hce.getMainLooper) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        java.lang.Exception exc = (java.lang.Exception) objArr[3];
        int i = getPaymentFci + 87;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            getmainlooper.DigitizedCardProfile.DigitizedCardProfile(str, str2, exc);
            int i2 = RecordsJson + 9;
            getPaymentFci = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        getmainlooper.DigitizedCardProfile.DigitizedCardProfile(str, str2, exc);
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getMainLooper getmainlooper = (com.payair.hce.getMainLooper) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.lang.String str2 = (java.lang.String) objArr[2];
        int i = getPaymentFci + 27;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            getmainlooper.DigitizedCardProfile.DigitizedCardProfile(str, str2);
            return null;
        }
        getmainlooper.DigitizedCardProfile.DigitizedCardProfile(str, str2);
        throw null;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void IccPrivateKeyCrtComponentsJson(java.lang.String str) {
        int i = RecordsJson + 33;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.DigitizedCardProfile.RecordsJson(str);
        } else {
            this.DigitizedCardProfile.RecordsJson(str);
            throw null;
        }
    }

    @Override // com.payair.hce.ExpirationDate
    public final void RecordsJson(java.lang.String str) {
        getPaymentFci = (RecordsJson + 27) % 128;
        this.DigitizedCardProfile.getProfileVersion(str);
        int i = getPaymentFci + 77;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private void getProfileVersion() {
        int i = getPaymentFci + 115;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            this.values.DigitizedCardProfile();
            throw null;
        }
        java.util.List<java.lang.String> DigitizedCardProfile = this.values.DigitizedCardProfile();
        if (DigitizedCardProfile == null || DigitizedCardProfile.isEmpty()) {
            return;
        }
        java.util.Iterator<java.lang.String> it = DigitizedCardProfile.iterator();
        RecordsJson = (getPaymentFci + 29) % 128;
        while (it.hasNext()) {
            int i2 = getPaymentFci + 13;
            RecordsJson = i2 % 128;
            if (i2 % 2 != 0) {
                getProfileVersion(it.next());
                throw null;
            }
            getProfileVersion(it.next());
        }
    }

    private void getProfileVersion(java.lang.String str) {
        java.util.Iterator<java.lang.String> it = this.values.RecordsJson(str).iterator();
        while (it.hasNext()) {
            int i = RecordsJson + 107;
            getPaymentFci = i % 128;
            if (i % 2 == 0) {
                com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(this.values.values(str, it.next()));
                throw new java.lang.ArithmeticException();
            }
            java.lang.String next = it.next();
            try {
                com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace valueOf = com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf(this.values.values(str, next));
                RecordsJson = (getPaymentFci + 39) % 128;
                byte[] DigitizedCardProfile = this.values.DigitizedCardProfile(str, next);
                if (valueOf == com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.valueOf) {
                    com.payair.hce.isNetworkError writeReplace = com.payair.hce.getAssets.writeReplace(DigitizedCardProfile);
                    this.values.AlternateContactlessPaymentDataJson(str, writeReplace.getProfileVersion(), com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus.writeReplace.values.DigitizedCardProfile(), com.payair.hce.bindService.DigitizedCardProfile(new java.util.Date(java.lang.System.currentTimeMillis())));
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getPaymentFci = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 6550649833788613015L;
    }

    @Override // com.payair.hce.ExpirationDate
    public final void AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        values(new java.lang.Object[]{this, str, str2}, 1412097134, -1412097130, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile(java.lang.String str, java.lang.String str2, java.lang.Exception exc) {
        values(new java.lang.Object[]{this, str, str2, exc}, -1513709069, 1513709069, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void DigitizedCardProfile() {
        values(new java.lang.Object[]{this}, 334957594, -334957589, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void values(java.lang.String str, java.lang.String str2) {
        values(new java.lang.Object[]{this, str, str2}, 1497166485, -1497166483, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.ExpirationDate
    public final void writeReplace(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        values(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i), str2, str3, exc}, -759707753, 759707754, i);
    }

    @Override // com.payair.hce.ExpirationDate
    public final void valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Exception exc) {
        values(new java.lang.Object[]{this, str, str2, str3, exc}, 1931580059, -1931580056, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{65, -108, -120, -80};
        $$b = 19;
    }

    @Override // com.payair.hce.gotPostData
    public final void DigitizedCardProfile(com.payair.hce.sendRequest sendrequest) throws com.payair.hce.setSuccessful {
        values(new java.lang.Object[]{this, sendrequest}, 533715521, -533715515, java.lang.System.identityHashCode(this));
    }
}
