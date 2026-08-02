package com.payair.hce;

/* loaded from: classes4.dex */
public class setAckPreEntryAllowed extends com.payair.hce.isPrimaryAidMchipDataValid<com.payair.hce.setPinAutomaticallyResetByApplication> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static int getCvrMaskAnd;
    private static char[] getGpoResponse;
    private static long getPaymentFci;
    private com.payair.hce.requestChangePin DigitizedCardProfile;
    private com.payair.hce.access300 IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.startDeviceAuthenticationForPurchase RecordsJson;
    private com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.access400 getAid;
    private com.payair.hce.setPanSequenceNumber getProfileVersion;
    private com.payair.hce.access000 writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setPinAutomaticallyResetByApplication setpinautomaticallyresetbyapplication = new com.payair.hce.setPinAutomaticallyResetByApplication((byte[]) objArr[1]);
        getCiacDecline = (getCvrMaskAnd + 31) % 128;
        return setpinautomaticallyresetbyapplication;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 73 - (s2 * 8);
        int i5 = 1 - (s * 3);
        int i6 = 4 - (i * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6++;
            i4 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i4 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvrMaskAnd = 0;
        getCiacDecline = 1;
        writeReplace();
        com.payair.hce.setRecords.values((byte) -82, com.payair.hce.setAckPreEntryAllowed.class);
        getCvrMaskAnd = (getCiacDecline + 33) % 128;
    }

    public setAckPreEntryAllowed() {
        DigitizedCardProfile(Byte.MIN_VALUE);
        AlternateContactlessPaymentDataJson((byte) 0);
        values((byte) 45, (byte) -1);
        DigitizedCardProfile();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (short s = 0; s <= 255; s = (short) (s + 1)) {
            int i = s & (-64);
            if (i == 128 || i == 0) {
                arrayList.add(java.lang.Byte.valueOf((byte) s));
            }
        }
        DigitizedCardProfile(arrayList);
        DigitizedCardProfile(com.payair.hce.onDeleteCardCompleted.valueOf.values);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f9, code lost:
    
        if (r4 == (-128)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.payair.hce.getContactlessSupported valueOf() throws com.payair.hce.getAtcCount {
        boolean z;
        boolean z2;
        boolean z3;
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> SdkCoreAlternateContactlessPaymentDataImpl;
        int RecordsJson;
        com.payair.hce.RemotePaymentData writeReplace;
        boolean valueOf;
        boolean valueOf2;
        byte RecordsJson2 = this.valueOf.RecordsJson();
        int i = RecordsJson2 & com.visa.cbp.getEncExpo.startTransaction;
        if (i == 0) {
            int i2 = getCvrMaskAnd + 7;
            getCiacDecline = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
                if (i != 64) {
                    getCiacDecline = (getCvrMaskAnd + 41) % 128;
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = i != -128;
                if ((RecordsJson2 & 16) != 16) {
                    getCvrMaskAnd = (getCiacDecline + 63) % 128;
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getTapTimeout();
                new java.lang.Object[]{java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z4), java.lang.Boolean.valueOf(z3)};
                com.payair.hce.access000 access000Var = (com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson();
                this.writeReplace = access000Var;
                this.DigitizedCardProfile = (com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var)));
                com.payair.hce.access000 access000Var2 = this.writeReplace;
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var2));
                this.getProfileVersion = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir));
                com.payair.hce.access000 access000Var3 = this.writeReplace;
                com.payair.hce.useDemoMode usedemomode = (com.payair.hce.useDemoMode) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var3}, -1433364550, 1433364556, java.lang.System.identityHashCode(access000Var3));
                com.payair.hce.access000 access000Var4 = this.writeReplace;
                com.payair.hce.setDigitizedCardId setdigitizedcardid = (com.payair.hce.setDigitizedCardId) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var4}, -725902463, 725902486, java.lang.System.identityHashCode(access000Var4));
                com.payair.hce.access000 access000Var5 = this.writeReplace;
                this.getAid = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var5}, -2078363504, 2078363507, java.lang.System.identityHashCode(access000Var5));
                com.payair.hce.access000 access000Var6 = this.writeReplace;
                this.IccPrivateKeyCrtComponentsJson = (com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var6}, 490902825, -490902823, java.lang.System.identityHashCode(access000Var6));
                byte[] cvrMaskAnd = this.valueOf.getCvrMaskAnd();
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getLongPressTimeout();
                android.view.View.resolveSizeAndState(0, 0, 0);
                new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(cvrMaskAnd)};
                SdkCoreAlternateContactlessPaymentDataImpl = this.getProfileVersion.SdkCoreAlternateContactlessPaymentDataImpl();
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track23 = this.AlternateContactlessPaymentDataJson;
                android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                android.view.View.MeasureSpec.getMode(0);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("㘯", android.view.View.MeasureSpec.getSize(0) + 1, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 121), objArr);
                new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(SdkCoreAlternateContactlessPaymentDataImpl, ((java.lang.String) objArr[0]).intern())};
                if (SdkCoreAlternateContactlessPaymentDataImpl != null) {
                    if (com.payair.hce.onRequestSessionCompleted.values(SdkCoreAlternateContactlessPaymentDataImpl) != cvrMaskAnd.length) {
                        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track24 = this.AlternateContactlessPaymentDataJson;
                        android.graphics.Color.blue(0);
                        android.text.TextUtils.indexOf("", "");
                        throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
                    }
                    com.payair.hce.access400 access400Var = this.getAid;
                    try {
                        int i3 = 0;
                        for (com.payair.hce.startDeviceAuthenticationForRegistration startdeviceauthenticationforregistration : SdkCoreAlternateContactlessPaymentDataImpl) {
                            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(startdeviceauthenticationforregistration.valueOf()), com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(java.util.Arrays.copyOfRange(cvrMaskAnd, i3, startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson() + i3)));
                            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track25 = this.AlternateContactlessPaymentDataJson;
                            android.view.ViewConfiguration.getScrollBarSize();
                            android.view.ViewConfiguration.getZoomControlsTimeout();
                            access400Var.DigitizedCardProfile(getwalletidentificationdataprovider);
                            i3 += startdeviceauthenticationforregistration.AlternateContactlessPaymentDataJson();
                        }
                    } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi | java.lang.RuntimeException unused) {
                        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track26 = this.AlternateContactlessPaymentDataJson;
                        android.widget.ExpandableListView.getPackedPositionType(0L);
                        android.view.View.MeasureSpec.getSize(0);
                        throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getPinAlwaysRequiredIfCurrencyNotProvided);
                    }
                }
                this.writeReplace.AlternateContactlessPaymentDataJson(cvrMaskAnd);
                RecordsJson = this.valueOf.RecordsJson() & com.visa.cbp.getEncExpo.startTransaction;
                if (RecordsJson != 0) {
                    ((com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson()).getCdol1RelatedDataLength();
                } else {
                    if (RecordsJson != 64) {
                        getCvrMaskAnd = (getCiacDecline + 105) % 128;
                    }
                    ((com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson()).getCrmCountryCode();
                }
                if (this.DigitizedCardProfile.valueOf()) {
                    writeReplace = this.getProfileVersion.writeReplace();
                } else {
                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track27 = this.AlternateContactlessPaymentDataJson;
                    android.view.ViewConfiguration.getScrollBarSize();
                    android.text.TextUtils.getOffsetBefore("", 0);
                    writeReplace = this.getProfileVersion.AlternateContactlessPaymentDataJson();
                }
                this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson(this.getProfileVersion.getPaymentFci());
                this.IccPrivateKeyCrtComponentsJson.DigitizedCardProfile();
                valueOf = this.DigitizedCardProfile.valueOf();
                com.payair.hce.createConfigurationContext createconfigurationcontext = (com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir));
                if (valueOf) {
                    valueOf2 = createconfigurationcontext.valueOf();
                } else {
                    int i4 = getCiacDecline + 85;
                    getCvrMaskAnd = i4 % 128;
                    if (i4 % 2 != 0) {
                        createconfigurationcontext.AlternateContactlessPaymentDataJson();
                        throw new java.lang.ArithmeticException();
                    }
                    valueOf2 = createconfigurationcontext.AlternateContactlessPaymentDataJson();
                }
                if (valueOf2) {
                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track28 = this.AlternateContactlessPaymentDataJson;
                    android.os.Process.getGidForName("");
                    android.view.ViewConfiguration.getScrollDefaultDelay();
                    new java.lang.Object[]{java.lang.Boolean.valueOf(this.DigitizedCardProfile.valueOf())};
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getBusinessLogicModule);
                }
                if (this.getProfileVersion.RecordsJson() != cvrMaskAnd.length || cvrMaskAnd.length < 45) {
                    com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track29 = this.AlternateContactlessPaymentDataJson;
                    android.graphics.PointF.length(0.0f, 0.0f);
                    android.view.View.combineMeasuredStates(0, 0);
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
                }
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track210 = this.AlternateContactlessPaymentDataJson;
                android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                java.util.List list = (java.util.List) com.payair.hce.setDigitizedCardId.DigitizedCardProfile(new java.lang.Object[]{setdigitizedcardid, this.writeReplace}, -376858347, 376858351, java.lang.System.identityHashCode(setdigitizedcardid));
                com.payair.hce.setMppLiteModule setmpplitemodule = new com.payair.hce.setMppLiteModule(valueOf((java.util.List<com.payair.hce.resetAuthenticationReferences>) list), list);
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track211 = this.AlternateContactlessPaymentDataJson;
                android.graphics.ImageFormat.getBitsPerPixel(0);
                new java.lang.Object[]{setmpplitemodule};
                com.payair.hce.removeCard profileVersion = this.DigitizedCardProfile.getProfileVersion();
                this.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
                com.payair.hce.reInitialize values = usedemomode.values(setmpplitemodule, profileVersion);
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track212 = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getJumpTapTimeout();
                android.graphics.PointF.length(0.0f, 0.0f);
                new java.lang.Object[]{values};
                if (values == null) {
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getBusinessLogicModule);
                }
                if (values == com.payair.hce.reInitialize.valueOf) {
                    getCvrMaskAnd = (getCiacDecline + 61) % 128;
                    if (z2 || z4) {
                        this.IccPrivateKeyCrtComponentsJson.valueOf().valueOf();
                        int i5 = getCvrMaskAnd + 37;
                        getCiacDecline = i5 % 128;
                        int i6 = i5 % 2;
                        return valueOf(values, setmpplitemodule, z, (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace}, -2044831319, 2044831320, java.lang.System.identityHashCode(writeReplace)));
                    }
                }
                this.IccPrivateKeyCrtComponentsJson.valueOf().DigitizedCardProfile();
                return valueOf(values, setmpplitemodule, z, (com.payair.hce.transactionCanBeResumed) com.payair.hce.RemotePaymentData.values(new java.lang.Object[]{writeReplace}, -2044831319, 2044831320, java.lang.System.identityHashCode(writeReplace)));
            }
        } else {
            getCiacDecline = (getCvrMaskAnd + 5) % 128;
        }
        z = false;
        if (i != 64) {
        }
        if (i != -128) {
        }
        if ((RecordsJson2 & 16) != 16) {
        }
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track213 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getTapTimeout();
        new java.lang.Object[]{java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z4), java.lang.Boolean.valueOf(z3)};
        com.payair.hce.access000 access000Var7 = (com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson();
        this.writeReplace = access000Var7;
        this.DigitizedCardProfile = (com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var7}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var7)));
        com.payair.hce.access000 access000Var22 = this.writeReplace;
        com.payair.hce.getCodeCacheDir getcodecachedir2 = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var22}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var22));
        this.getProfileVersion = (com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir2));
        com.payair.hce.access000 access000Var32 = this.writeReplace;
        com.payair.hce.useDemoMode usedemomode2 = (com.payair.hce.useDemoMode) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var32}, -1433364550, 1433364556, java.lang.System.identityHashCode(access000Var32));
        com.payair.hce.access000 access000Var42 = this.writeReplace;
        com.payair.hce.setDigitizedCardId setdigitizedcardid2 = (com.payair.hce.setDigitizedCardId) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var42}, -725902463, 725902486, java.lang.System.identityHashCode(access000Var42));
        com.payair.hce.access000 access000Var52 = this.writeReplace;
        this.getAid = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var52}, -2078363504, 2078363507, java.lang.System.identityHashCode(access000Var52));
        com.payair.hce.access000 access000Var62 = this.writeReplace;
        this.IccPrivateKeyCrtComponentsJson = (com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var62}, 490902825, -490902823, java.lang.System.identityHashCode(access000Var62));
        byte[] cvrMaskAnd2 = this.valueOf.getCvrMaskAnd();
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track222 = this.AlternateContactlessPaymentDataJson;
        android.view.ViewConfiguration.getLongPressTimeout();
        android.view.View.resolveSizeAndState(0, 0, 0);
        new java.lang.Object[]{com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(cvrMaskAnd2)};
        SdkCoreAlternateContactlessPaymentDataImpl = this.getProfileVersion.SdkCoreAlternateContactlessPaymentDataImpl();
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track232 = this.AlternateContactlessPaymentDataJson;
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("㘯", android.view.View.MeasureSpec.getSize(0) + 1, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 121), objArr2);
        new java.lang.Object[]{com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(SdkCoreAlternateContactlessPaymentDataImpl, ((java.lang.String) objArr2[0]).intern())};
        if (SdkCoreAlternateContactlessPaymentDataImpl != null) {
        }
        this.writeReplace.AlternateContactlessPaymentDataJson(cvrMaskAnd2);
        RecordsJson = this.valueOf.RecordsJson() & com.visa.cbp.getEncExpo.startTransaction;
        if (RecordsJson != 0) {
        }
        if (this.DigitizedCardProfile.valueOf()) {
        }
        this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson(this.getProfileVersion.getPaymentFci());
        this.IccPrivateKeyCrtComponentsJson.DigitizedCardProfile();
        valueOf = this.DigitizedCardProfile.valueOf();
        com.payair.hce.createConfigurationContext createconfigurationcontext2 = (com.payair.hce.createConfigurationContext) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir2}, -775162360, 775162363, java.lang.System.identityHashCode(getcodecachedir2));
        if (valueOf) {
        }
        if (valueOf2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        r13 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r5), r3, r3, java.lang.Integer.valueOf(r5), r3, r3, java.lang.Integer.valueOf(r5), r3, r3, java.lang.Integer.valueOf(r5), r3};
        r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0197, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0199, code lost:
    
        r6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.Color.green(0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3596, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x020e, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r13)).intValue() != r3.SdkCoreAlternateContactlessPaymentDataImpl) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0210, code lost:
    
        com.payair.hce.setAckPreEntryAllowed.$10 = (com.payair.hce.setAckPreEntryAllowed.$11 + 3) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x021a, code lost:
    
        r12 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r3, r3, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r3, java.lang.Integer.valueOf(r5), r3};
        r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0255, code lost:
    
        if (r6 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0257, code lost:
    
        r6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 48, 2664 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (18889 - android.text.TextUtils.indexOf("", "", 0, 0)));
        r14 = new java.lang.Object[1];
        b(0, 0, 0, r14);
        r6 = r6.getMethod((java.lang.String) r14[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02c1, code lost:
    
        r6 = ((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r12)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02ce, code lost:
    
        r12 = r3.AlternateContactlessPaymentDataJson;
        r15 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r7[r3.values] = r4[r6];
        r7[r3.values + 1] = r4[(r12 * r5) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0332, code lost:
    
        r3.values += 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02e7, code lost:
    
        if (r3.DigitizedCardProfile != r3.AlternateContactlessPaymentDataJson) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02e9, code lost:
    
        com.payair.hce.setAckPreEntryAllowed.$11 = (com.payair.hce.setAckPreEntryAllowed.$10 + 7) % 128;
        r3.RecordsJson = ((r3.RecordsJson + r5) - 1) % r5;
        r3.SdkCoreAlternateContactlessPaymentDataImpl = ((r3.SdkCoreAlternateContactlessPaymentDataImpl + r5) - 1) % r5;
        r6 = r3.DigitizedCardProfile;
        r12 = r3.RecordsJson;
        r13 = r3.AlternateContactlessPaymentDataJson;
        r15 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r7[r3.values] = r4[(r6 * r5) + r12];
        r7[r3.values + 1] = r4[(r13 * r5) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0319, code lost:
    
        r6 = r3.DigitizedCardProfile;
        r12 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r13 = r3.AlternateContactlessPaymentDataJson;
        r14 = r3.RecordsJson;
        r7[r3.values] = r4[(r6 * r5) + r12];
        r7[r3.values + 1] = r4[(r13 * r5) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        r7[r3.values] = (char) (r3.valueOf - r30);
        r7[r3.values + 1] = (char) (r3.writeReplace - r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0131, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getGpoResponse;
        int i3 = 48;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + i3, android.view.Gravity.getAbsoluteGravity(0, 0) + 2508, (char) (6802 - android.graphics.Color.blue(0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, (short) 1, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 48;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 49, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2508, (char) (6802 - android.graphics.Color.blue(0)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 0, (short) 1, 0, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            int i5 = $10 + 39;
            $11 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i7 = $11 + 25;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    int i8 = digitizedCardJson12.values;
                    digitizedCardJson12.writeReplace = charArray[0];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        for (int i9 = 0; i9 < i; i9++) {
            cArr3[i9] = (char) (cArr3[i9] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0177, code lost:
    
        if (r2.contains(com.payair.hce.resetAuthenticationReferences.valueOf) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.payair.hce.getContactlessSupported valueOf(com.payair.hce.reInitialize reinitialize, com.payair.hce.setMppLiteModule setmpplitemodule, boolean z, com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.getAtcCount {
        boolean z2;
        com.payair.hce.getMDESCardsUniqueTokenReferences getmdescardsuniquetokenreferences;
        com.payair.hce.getContactlessSupported AlternateContactlessPaymentDataJson;
        int i = getCvrMaskAnd + 47;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.reInitialize reinitialize2 = com.payair.hce.reInitialize.writeReplace;
            throw new java.lang.ArithmeticException();
        }
        if (reinitialize != com.payair.hce.reInitialize.writeReplace) {
            int i2 = getCvrMaskAnd + 39;
            getCiacDecline = i2 % 128;
            if (i2 % 2 == 0) {
                com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
                throw null;
            }
            com.payair.hce.access000.SdkCoreCardRiskManagementDataImpl();
        }
        com.payair.hce.access000 access000Var = this.writeReplace;
        com.payair.hce.requestSetWalletPin requestsetwalletpin = (com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.setPanSequenceNumber setpansequencenumber = this.getProfileVersion;
        int intValue = ((java.lang.Integer) com.payair.hce.requestSetWalletPin.writeReplace(new java.lang.Object[]{requestsetwalletpin, reinitialize, setmpplitemodule, (com.payair.hce.suspendCardForToken) com.payair.hce.initialize.valueOf(new java.lang.Object[]{setpansequencenumber}, -566547452, 566547452, java.lang.System.identityHashCode(setpansequencenumber)), this.getProfileVersion.getCvmResetTimeout(), com.payair.hce.activateCardForToken.writeReplace}, 1973476689, -1973476689, java.lang.System.identityHashCode(requestsetwalletpin))).intValue();
        java.util.List<com.payair.hce.resetAuthenticationReferences> DigitizedCardProfile = setmpplitemodule.DigitizedCardProfile();
        com.payair.hce.createInvalidationTracker valueOf = this.IccPrivateKeyCrtComponentsJson.valueOf();
        if (((com.payair.hce.transactionCanBeResumed) com.payair.hce.createInvalidationTracker.valueOf(new java.lang.Object[]{valueOf}, -2050425528, 2050425528, java.lang.System.identityHashCode(valueOf))).AlternateContactlessPaymentDataJson(0) == Byte.MIN_VALUE) {
            this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().valueOf();
        } else {
            com.payair.hce.getAutoMigrations AlternateContactlessPaymentDataJson2 = this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson();
            com.payair.hce.getAutoMigrations.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson2}, -1755701004, 1755701006, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson2));
        }
        if (reinitialize == com.payair.hce.reInitialize.valueOf && (this.valueOf.RecordsJson() & 16) == 16) {
            int i3 = getCiacDecline + 31;
            getCvrMaskAnd = i3 % 128;
            if (i3 % 2 != 0) {
                this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().DigitizedCardProfile();
                throw null;
            }
            this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().DigitizedCardProfile();
        }
        boolean z3 = this.DigitizedCardProfile.values() == com.payair.hce.activateVisaCardForToken.valueOf;
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.view.ViewConfiguration.getJumpTapTimeout();
        new java.lang.Object[]{java.lang.Boolean.valueOf(z3)};
        com.payair.hce.getAutoMigrations AlternateContactlessPaymentDataJson3 = this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson();
        if (z3) {
            z2 = false;
        } else {
            getCiacDecline = (getCvrMaskAnd + 99) % 128;
            z2 = true;
        }
        com.payair.hce.getAutoMigrations.AlternateContactlessPaymentDataJson(new java.lang.Object[]{AlternateContactlessPaymentDataJson3, java.lang.Boolean.valueOf(z2)}, -1654643959, 1654643959, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3));
        if (DigitizedCardProfile.contains(com.payair.hce.resetAuthenticationReferences.SdkCoreAlternateContactlessPaymentDataImpl)) {
            this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().SdkCoreAlternateContactlessPaymentDataImpl();
            getCvrMaskAnd = (getCiacDecline + 67) % 128;
        }
        try {
            if (intValue != com.payair.hce.setApplicationExpiryDate.getProfileVersion) {
                if (!DigitizedCardProfile.contains(com.payair.hce.resetAuthenticationReferences.getAid)) {
                    getCiacDecline = (getCvrMaskAnd + 117) % 128;
                    if (!DigitizedCardProfile.contains(com.payair.hce.resetAuthenticationReferences.values)) {
                    }
                }
                if (this.getAid.SdkCoreAlternateContactlessPaymentDataImpl().values()) {
                    this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().writeReplace();
                }
            }
        } catch (com.payair.hce.getSetPinRequestData unused) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
            android.view.KeyEvent.getMaxKeyCode();
            android.view.ViewConfiguration.getMinimumFlingVelocity();
        }
        this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().AlternateContactlessPaymentDataJson(intValue);
        com.payair.hce.clearInternalStorage DigitizedCardProfile2 = com.payair.hce.requestSetWalletPin.DigitizedCardProfile(intValue, this.getProfileVersion.getCvmResetTimeout());
        com.payair.hce.createInvalidationTracker valueOf2 = this.IccPrivateKeyCrtComponentsJson.valueOf();
        if (((com.payair.hce.transactionCanBeResumed) com.payair.hce.createInvalidationTracker.valueOf(new java.lang.Object[]{valueOf2}, -2050425528, 2050425528, java.lang.System.identityHashCode(valueOf2))).AlternateContactlessPaymentDataJson(0) == 0) {
            this.IccPrivateKeyCrtComponentsJson.DigitizedCardProfile(intValue, reinitialize, setmpplitemodule);
        } else {
            com.payair.hce.access300 access300Var = this.IccPrivateKeyCrtComponentsJson;
            com.payair.hce.access300.values(new java.lang.Object[]{access300Var}, -208460597, 208460598, java.lang.System.identityHashCode(access300Var));
        }
        com.payair.hce.access000 access000Var2 = this.writeReplace;
        com.payair.hce.getAutoMigrations AlternateContactlessPaymentDataJson4 = ((com.payair.hce.access300) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, 490902825, -490902823, java.lang.System.identityHashCode(access000Var2))).AlternateContactlessPaymentDataJson();
        com.payair.hce.createInvalidationTracker valueOf3 = this.IccPrivateKeyCrtComponentsJson.valueOf();
        if (((com.payair.hce.transactionCanBeResumed) com.payair.hce.createInvalidationTracker.valueOf(new java.lang.Object[]{valueOf3}, -2050425528, 2050425528, java.lang.System.identityHashCode(valueOf3))).AlternateContactlessPaymentDataJson(0) == Byte.MIN_VALUE) {
            getmdescardsuniquetokenreferences = com.payair.hce.getMDESCardsUniqueTokenReferences.valueOf;
        } else if (z) {
            getCiacDecline = (getCvrMaskAnd + 79) % 128;
            getmdescardsuniquetokenreferences = AlternateContactlessPaymentDataJson4.RecordsJson() ? com.payair.hce.getMDESCardsUniqueTokenReferences.AlternateContactlessPaymentDataJson : com.payair.hce.getMDESCardsUniqueTokenReferences.DigitizedCardProfile;
        } else {
            getmdescardsuniquetokenreferences = reinitialize == com.payair.hce.reInitialize.DigitizedCardProfile ? com.payair.hce.getMDESCardsUniqueTokenReferences.writeReplace : com.payair.hce.getMDESCardsUniqueTokenReferences.values;
        }
        com.payair.hce.access000 access000Var3 = this.writeReplace;
        com.payair.hce.onSdkUnregistered onsdkunregistered = (com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var3}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var3));
        int i4 = com.payair.hce.setAckPreEntryAllowed.AnonymousClass4.writeReplace[reinitialize.ordinal()];
        if (i4 == 1) {
            try {
                com.payair.hce.startDeviceAuthenticationForPurchase valueOf4 = onsdkunregistered.valueOf(com.payair.hce.getUrl.values, com.payair.hce.activateCardForToken.writeReplace);
                this.RecordsJson = valueOf4;
                writeReplace(valueOf4);
                AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(transactioncanberesumed, com.payair.hce.clearInternalStorage.AlternateContactlessPaymentDataJson);
            } catch (com.payair.hce.setUserID unused2) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track23 = this.AlternateContactlessPaymentDataJson;
                android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl);
            }
        } else if (i4 == 2) {
            try {
                com.payair.hce.startDeviceAuthenticationForPurchase valueOf5 = onsdkunregistered.valueOf(com.payair.hce.getUrl.values, com.payair.hce.activateCardForToken.writeReplace);
                this.RecordsJson = valueOf5;
                writeReplace(valueOf5);
                AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(transactioncanberesumed, com.payair.hce.clearInternalStorage.AlternateContactlessPaymentDataJson);
                try {
                    com.payair.hce.access400 access400Var = this.getAid;
                    com.payair.hce.access000.AlternateContactlessPaymentDataJson(new com.payair.hce.onReplenishFailed((com.payair.hce.provisionFromLocalStorage) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var}, 1737569389, -1737569387, java.lang.System.identityHashCode(access400Var)), this.getAid.valueOf(), this.DigitizedCardProfile.valueOf()));
                } catch (com.payair.hce.getSetPinRequestData unused3) {
                    throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided);
                }
            } catch (com.payair.hce.setUserID unused4) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track24 = this.AlternateContactlessPaymentDataJson;
                android.text.TextUtils.getOffsetBefore("", 0);
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl);
            }
        } else {
            if (i4 != 3) {
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
            }
            try {
                com.payair.hce.startDeviceAuthenticationForPurchase valueOf6 = onsdkunregistered.valueOf(com.payair.hce.getUrl.writeReplace, com.payair.hce.activateCardForToken.writeReplace);
                this.RecordsJson = valueOf6;
                getCiacDecline = (getCvrMaskAnd + 53) % 128;
                writeReplace(valueOf6);
                if (z) {
                    this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().getProfileVersion();
                    AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(transactioncanberesumed, DigitizedCardProfile2);
                } else {
                    this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().getProfileVersion();
                    com.payair.hce.access000 access000Var4 = this.writeReplace;
                    ((com.payair.hce.processNotificationData) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var4}, -1684199295, 1684199305, java.lang.System.identityHashCode(access000Var4))).AlternateContactlessPaymentDataJson();
                    AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(transactioncanberesumed, DigitizedCardProfile2);
                }
            } catch (com.payair.hce.setUserID unused5) {
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track25 = this.AlternateContactlessPaymentDataJson;
                android.view.KeyEvent.getDeadChar(0, 0);
                throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRemotePaymentDataImpl);
            }
        }
        com.payair.hce.onReplenishCompleted onreplenishcompleted = new com.payair.hce.onReplenishCompleted(getmdescardsuniquetokenreferences, this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(), this.DigitizedCardProfile.getProfileVersion(), this.SdkCoreAlternateContactlessPaymentDataImpl);
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track26 = this.AlternateContactlessPaymentDataJson;
        android.view.View.resolveSizeAndState(0, 0, 0);
        new java.lang.Object[]{onreplenishcompleted};
        com.payair.hce.access000 access000Var5 = this.writeReplace;
        ((com.payair.hce.onShowAuthenticateScreen) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var5}, 1571618569, -1571618562, java.lang.System.identityHashCode(access000Var5))).DigitizedCardProfile(onreplenishcompleted);
        return AlternateContactlessPaymentDataJson;
    }

    /* renamed from: com.payair.hce.setAckPreEntryAllowed$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int DigitizedCardProfile = 1;
        static final /* synthetic */ int[] writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.reInitialize.values().length];
            writeReplace = iArr;
            try {
                iArr[com.payair.hce.reInitialize.DigitizedCardProfile.ordinal()] = 1;
                int i = DigitizedCardProfile;
                int i2 = i & 97;
                int i3 = ((i ^ 97) | i2) << 1;
                int i4 = -((i | 97) & (~i2));
                int i5 = (i3 & i4) + (i4 | i3);
                AlternateContactlessPaymentDataJson = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 5;
                }
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                writeReplace[com.payair.hce.reInitialize.writeReplace.ordinal()] = 2;
                int i7 = DigitizedCardProfile + 7;
                AlternateContactlessPaymentDataJson = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                writeReplace[com.payair.hce.reInitialize.valueOf.ordinal()] = 3;
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 27) % 128;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private com.payair.hce.getContactlessSupported AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.clearInternalStorage clearinternalstorage) throws com.payair.hce.getAtcCount {
        com.payair.hce.setAlternateContactlessPaymentData setalternatecontactlesspaymentdata;
        com.payair.hce.getSetPinRequestData getsetpinrequestdata;
        java.lang.Throwable th;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2;
        com.payair.hce.setPinAlwaysRequiredIfCurrencyProvided setpinalwaysrequiredifcurrencyprovided;
        int i = getCvrMaskAnd;
        getCiacDecline = (i + 7) % 128;
        if (transactioncanberesumed != null) {
            getCiacDecline = (i + 109) % 128;
            if (!transactioncanberesumed.getProfileVersion()) {
                int i2 = getCvrMaskAnd + 63;
                getCiacDecline = i2 % 128;
                if (i2 % 2 != 0) {
                    this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().DigitizedCardProfile(transactioncanberesumed);
                } else {
                    this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().DigitizedCardProfile(transactioncanberesumed);
                    throw null;
                }
            }
        }
        try {
            try {
                com.payair.hce.access000 access000Var = this.writeReplace;
                transactioncanberesumed2 = ((com.payair.hce.createDeviceProtectedStorageContext) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 78805414, -78805398, java.lang.System.identityHashCode(access000Var))).DigitizedCardProfile(com.payair.hce.getTokenPan.values);
            } catch (java.lang.Throwable th2) {
                th = th2;
                th = th;
                transactioncanberesumed2 = null;
                com.payair.hce.onAuthenticationFailed.values(transactioncanberesumed2);
                throw th;
            }
            try {
                com.payair.hce.access000 access000Var2 = this.writeReplace;
                byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var2}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var2))).AlternateContactlessPaymentDataJson(transactioncanberesumed2.valueOf(), com.payair.hce.clearInternalStorage.writeReplace);
                com.payair.hce.access000 access000Var3 = this.writeReplace;
                byte[] AlternateContactlessPaymentDataJson2 = ((com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var3}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var3))).AlternateContactlessPaymentDataJson(transactioncanberesumed2.valueOf(), clearinternalstorage);
                if (AlternateContactlessPaymentDataJson == null || AlternateContactlessPaymentDataJson2 == null) {
                    com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate = com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a("!\u0010\u00139\u0017\u0019\b\u0015\u0017\t<\u0012\u0018\u001c\u001f'=<4&\u0011\u0017.\u0012\u000b?㙓", 27 - android.view.View.resolveSize(0, 0), (byte) (96 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr);
                    throw new com.payair.hce.getCurrentRequestId(requesttaskstatusupdate, ((java.lang.String) objArr[0]).intern());
                }
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
                android.widget.ExpandableListView.getPackedPositionChild(0L);
                new java.lang.Object[]{this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson()};
                com.payair.hce.setCiacDeclineOnPpms AlternateContactlessPaymentDataJson3 = com.payair.hce.createDeviceProtectedStorageContext.AlternateContactlessPaymentDataJson(this.getProfileVersion.getPaymentFci(), this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().values().valueOf(), AlternateContactlessPaymentDataJson);
                if (this.IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson().RecordsJson()) {
                    com.payair.hce.transactionCanBeResumed writeReplace = com.payair.hce.transactionCanBeResumed.writeReplace(0);
                    try {
                        com.payair.hce.getRequiredAutoMigrationSpecs RecordsJson = this.IccPrivateKeyCrtComponentsJson.RecordsJson();
                        writeReplace.writeReplace(this.writeReplace.getAdditionalCheckTable());
                        writeReplace.writeReplace(this.IccPrivateKeyCrtComponentsJson.valueOf().writeReplace().DigitizedCardProfile());
                        writeReplace.writeReplace(this.IccPrivateKeyCrtComponentsJson.getAid().values().DigitizedCardProfile());
                        writeReplace.writeReplace(((com.payair.hce.getWalletIdentificationDataProvider) com.payair.hce.setCiacDeclineOnPpms.DigitizedCardProfile(new java.lang.Object[]{AlternateContactlessPaymentDataJson3}, -493169071, 493169072, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson3))).DigitizedCardProfile());
                        if (RecordsJson != null) {
                            writeReplace.writeReplace(RecordsJson.SdkCoreAlternateContactlessPaymentDataImpl().DigitizedCardProfile());
                        }
                        getCiacDecline = (getCvrMaskAnd + 91) % 128;
                        try {
                            com.payair.hce.access000 access000Var4 = this.writeReplace;
                            com.payair.hce.onSdkUnregistered onsdkunregistered = (com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var4}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var4));
                            byte[] AlternateContactlessPaymentDataJson4 = this.RecordsJson.AlternateContactlessPaymentDataJson();
                            com.payair.hce.createInvalidationTracker valueOf = this.IccPrivateKeyCrtComponentsJson.valueOf();
                            byte[] DigitizedCardProfile = onsdkunregistered.DigitizedCardProfile(AlternateContactlessPaymentDataJson4, ((com.payair.hce.transactionCanBeResumed) com.payair.hce.createInvalidationTracker.valueOf(new java.lang.Object[]{valueOf}, -2050425528, 2050425528, java.lang.System.identityHashCode(valueOf))).valueOf()[0], AlternateContactlessPaymentDataJson2, this.writeReplace.getCardholderValidators().valueOf(), writeReplace.valueOf(), this.getAid.IccPrivateKeyCrtComponentsJson().SdkCoreAlternateContactlessPaymentDataImpl().valueOf());
                            if (DigitizedCardProfile == null) {
                                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate2 = com.payair.hce.requestTaskStatusUpdate.getRecordNumber;
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                a("!\u0010\u00139\u0017\u0019\b\u0015\u0017\t<\u0012\u001a\u000f\f\u0017;2\u000f\u001d\u0000\u0010\u000227\u000e?\u001c:(\u0012.\u001c?>3 \u0014\u0012.\u0017\u000e<;", 44 - android.text.TextUtils.getOffsetAfter("", 0), (byte) (82 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr2);
                                throw new com.payair.hce.getCurrentRequestId(requesttaskstatusupdate2, ((java.lang.String) objArr2[0]).intern());
                            }
                            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson5 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(DigitizedCardProfile);
                            setpinalwaysrequiredifcurrencyprovided = new com.payair.hce.setPinAlwaysRequiredIfCurrencyProvided();
                            setpinalwaysrequiredifcurrencyprovided.writeReplace(this.IccPrivateKeyCrtComponentsJson.valueOf(), this.IccPrivateKeyCrtComponentsJson.getAid(), AlternateContactlessPaymentDataJson5, AlternateContactlessPaymentDataJson3, this.IccPrivateKeyCrtComponentsJson.RecordsJson());
                        } catch (com.payair.hce.getJWTToken unused) {
                            com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate3 = com.payair.hce.requestTaskStatusUpdate.getRecordNumber;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a("!\u0010\u00139\u0017\u0019\b\u0015\u0017\t<\u0012\u001a\u000f\f\u0017;2\u000f\u001d\u0000\u0010\u000227\u000e?\u001c:(\u0012.\u001c?>3 \u0014\u0012.\u0017\u000e<;", 43 - android.view.MotionEvent.axisFromString(""), (byte) (81 - android.view.View.MeasureSpec.getMode(0)), objArr3);
                            throw new com.payair.hce.getCurrentRequestId(requesttaskstatusupdate3, ((java.lang.String) objArr3[0]).intern());
                        }
                    } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
                        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
                        android.os.Process.getThreadPriority(0);
                        throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
                    }
                } else {
                    setpinalwaysrequiredifcurrencyprovided = new com.payair.hce.setPinAlwaysRequiredIfCurrencyProvided();
                    setpinalwaysrequiredifcurrencyprovided.DigitizedCardProfile(this.IccPrivateKeyCrtComponentsJson.valueOf(), this.IccPrivateKeyCrtComponentsJson.getAid(), com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2), AlternateContactlessPaymentDataJson3, this.IccPrivateKeyCrtComponentsJson.RecordsJson());
                }
                com.payair.hce.access000 access000Var5 = this.writeReplace;
                com.payair.hce.onUserValidationObtained onuservalidationobtained = (com.payair.hce.onUserValidationObtained) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var5}, 706360202, -706360174, java.lang.System.identityHashCode(access000Var5));
                com.payair.hce.access000 access000Var6 = this.writeReplace;
                com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var6}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var6));
                com.payair.hce.transactionCanBeResumed ciacDecline = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir))).getCiacDecline();
                com.payair.hce.transactionCanBeResumed valueOf2 = this.IccPrivateKeyCrtComponentsJson.getAid().valueOf();
                com.payair.hce.access000 access000Var7 = this.writeReplace;
                this.SdkCoreAlternateContactlessPaymentDataImpl = onuservalidationobtained.AlternateContactlessPaymentDataJson((com.payair.hce.onSdkUnregistered) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var7}, -487406649, 487406674, java.lang.System.identityHashCode(access000Var7)), ciacDecline, valueOf2, com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2));
                com.payair.hce.onAuthenticationFailed.values(transactioncanberesumed2);
                int i3 = getCvrMaskAnd + 25;
                getCiacDecline = i3 % 128;
                if (i3 % 2 != 0) {
                    return setpinalwaysrequiredifcurrencyprovided;
                }
                throw null;
            } catch (com.payair.hce.getSetPinRequestData e) {
                getsetpinrequestdata = e;
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate4 = com.payair.hce.requestTaskStatusUpdate.getAckAlwaysRequiredIfCurrencyNotProvided;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("\u0012/㘇㘇>\u0013\u001e/\n?\u000f\u001d\n9 \u0014\u0017\u001e\u001a(\u0017\u001c\u001b:\u000b5,\t\u001b\u000f\f9=9\n8.2\f?\u0013\u00113&1\u0013\u001b?\u0017\u0019:(\u0012.\u0018\u0013\u0017.2;\u0017\u000e:,\u0017\u000e<;\u0013?\u000b5\u0005\r㗍", 75 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (android.text.TextUtils.getTrimmedLength("") + 19), objArr4);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr4[0]).intern());
                sb.append(getsetpinrequestdata.getMessage());
                throw new com.payair.hce.getCurrentRequestId(requesttaskstatusupdate4, sb.toString());
            } catch (com.payair.hce.setAlternateContactlessPaymentData e2) {
                setalternatecontactlesspaymentdata = e2;
                com.payair.hce.requestTaskStatusUpdate requesttaskstatusupdate5 = com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a("\u0010\u0012\f \u0013>\u001e7=\u000b\u0011(7\u001b/+\t/5\u000b\u001d\u000f\u0011\u0012\n?\u0017\u001c\u0010\u0012\f \u0013>\u0015\u0012.2\u0019\u000f<\"\u0011\u0017\u001c\u00172;1\u0013.\u0012\u000b?=\u0002㖽", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 57, (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 3), objArr5);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(((java.lang.String) objArr5[0]).intern());
                sb2.append(setalternatecontactlesspaymentdata.getMessage());
                throw new com.payair.hce.getCurrentRequestId(requesttaskstatusupdate5, sb2.toString());
            } catch (java.lang.Throwable th3) {
                th = th3;
                com.payair.hce.onAuthenticationFailed.values(transactioncanberesumed2);
                throw th;
            }
        } catch (com.payair.hce.getSetPinRequestData e3) {
            getsetpinrequestdata = e3;
        } catch (com.payair.hce.setAlternateContactlessPaymentData e4) {
            setalternatecontactlesspaymentdata = e4;
        } catch (java.lang.Throwable th4) {
            th = th4;
            th = th;
            transactioncanberesumed2 = null;
            com.payair.hce.onAuthenticationFailed.values(transactioncanberesumed2);
            throw th;
        }
    }

    private void writeReplace(com.payair.hce.startDeviceAuthenticationForPurchase startdeviceauthenticationforpurchase) throws com.payair.hce.getAtcCount {
        try {
            this.IccPrivateKeyCrtComponentsJson.writeReplace(new com.payair.hce.clearAllTables(startdeviceauthenticationforpurchase.writeReplace()));
            getCvrMaskAnd = (getCiacDecline + 97) % 128;
        } catch (com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
            android.view.KeyEvent.getMaxKeyCode();
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    static void writeReplace() {
        getPaymentFci = 2659820190789000516L;
        getGpoResponse = new char[]{1489, 12407, 12415, 12348, 12411, 12400, 12389, 1496, 12339, 12291, 12313, 12386, 12345, 12334, 1492, 12323, 12351, 12344, 12292, 1498, 12333, 12349, 12350, 12297, 12318, 12319, 12295, 12299, 12314, 1500, 1495, 12394, 12303, 1491, 1499, 12328, 12346, 12414, 1493, 12317, 12388, 12326, 12331, 12293, 12312, 1490, 12332, 12322, 12300, 12391, 12294, 12335, 12290, 1497, 12327, 12399, 12302, 1494, 12324, 12325, 12329, 12387, 12390, 12347};
        SdkCoreBusinessLogicModuleImpl = (char) 1496;
    }

    static void init$0() {
        $$a = new byte[]{106, 94, -55, -52};
        $$b = 35;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.payair.hce.setMobilePinInitialConfiguration, com.payair.hce.setPinAutomaticallyResetByApplication] */
    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final /* synthetic */ com.payair.hce.setPinAutomaticallyResetByApplication DigitizedCardProfile(byte[] bArr) throws com.payair.hce.digitize {
        return (com.payair.hce.setMobilePinInitialConfiguration) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr}, -1820852360, 1820852360, java.lang.System.identityHashCode(this));
    }
}
