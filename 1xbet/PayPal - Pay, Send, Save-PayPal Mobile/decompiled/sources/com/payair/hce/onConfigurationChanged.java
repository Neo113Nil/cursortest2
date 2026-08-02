package com.payair.hce;

/* loaded from: classes4.dex */
public class onConfigurationChanged {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getAdditionalCheckTable;
    private static char[] getApplicationLifeCycleData;
    private static char getCvmResetTimeout;
    private static int getMchipCvmIssuerOptions;
    private com.payair.hce.checkForSuccess AlternateContactlessPaymentDataJson;
    private com.payair.hce.setUpMCBP DigitizedCardProfile;
    private com.payair.hce.getPackageName IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.VisaRepersoInitializer RecordsJson;
    private com.payair.hce.useDemoMode SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getOpPackageName SdkCoreBusinessLogicModuleImpl;
    private boolean getCardLayoutDescription;
    private com.payair.hce.obtainStyledAttributes getCiacDecline;
    private com.payair.hce.getErrors getDualTapResetTimeout;
    private com.payair.hce.getApplicationInfo getGpoResponse;
    private boolean getProfileVersion;
    private com.payair.hce.checkPermission getSecurityWord;
    private com.payair.hce.sendUpdateRNSInformation valueOf;
    private com.payair.hce.accessgetCoroutineScopep values;
    private com.payair.hce.gotPostData writeReplace;
    private java.lang.String getAid = null;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getCvrMaskAnd = null;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> getPaymentFci = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 73 - (s * 8);
        byte[] bArr = $$a;
        int i5 = i * 4;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            int i8 = 0;
            i4 += -i6;
            i6 = i7;
            i3 = i8;
            int i9 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3 + 1;
            i7 = i9;
            i6 = bArr[i9];
            i8 = i10;
            i4 += -i6;
            i6 = i7;
            i3 = i8;
            int i92 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i922 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~(i4 | i2);
        int i7 = (i * 398) + (i2 * (-396)) + (((~(i4 | i5)) | i6 | (~(i5 | i2))) * (-397)) + (i6 * (-397)) + (((~(i | (~i2))) | i3 | i6) * 397);
        if (i7 != 1) {
            return i7 != 2 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }
        com.payair.hce.onConfigurationChanged onconfigurationchanged = (com.payair.hce.onConfigurationChanged) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i8 = getAdditionalCheckTable;
        getMchipCvmIssuerOptions = (i8 + 17) % 128;
        onconfigurationchanged.getProfileVersion = booleanValue;
        getMchipCvmIssuerOptions = (i8 + 97) % 128;
        return onconfigurationchanged;
    }

    public onConfigurationChanged() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0003\u0002\u0004\u0007\u0007\u0005", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 6, (byte) (121 - android.text.TextUtils.getOffsetBefore("", 0)), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.onConfigurationChanged.class.getName());
        this.getSecurityWord = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
    }

    public final com.payair.hce.onConfigurationChanged values(com.payair.hce.accessgetCoroutineScopep accessgetcoroutinescopep) {
        int i = getAdditionalCheckTable + 125;
        getMchipCvmIssuerOptions = i % 128;
        if (i % 2 == 0) {
            this.values = accessgetcoroutinescopep;
            return this;
        }
        this.values = accessgetcoroutinescopep;
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.onConfigurationChanged onconfigurationchanged = (com.payair.hce.onConfigurationChanged) objArr[0];
        com.payair.hce.VisaRepersoInitializer visaRepersoInitializer = (com.payair.hce.VisaRepersoInitializer) objArr[1];
        int i = (getMchipCvmIssuerOptions + 55) % 128;
        getAdditionalCheckTable = i;
        onconfigurationchanged.RecordsJson = visaRepersoInitializer;
        int i2 = i + 9;
        getMchipCvmIssuerOptions = i2 % 128;
        if (i2 % 2 == 0) {
            return onconfigurationchanged;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.onConfigurationChanged AlternateContactlessPaymentDataJson(com.payair.hce.sendUpdateRNSInformation sendupdaternsinformation) {
        int i = getMchipCvmIssuerOptions;
        getAdditionalCheckTable = (i + 39) % 128;
        this.valueOf = sendupdaternsinformation;
        int i2 = i + 63;
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final com.payair.hce.onConfigurationChanged valueOf(com.payair.hce.gotPostData gotpostdata) {
        int i = getMchipCvmIssuerOptions;
        getAdditionalCheckTable = (i + 77) % 128;
        this.writeReplace = gotpostdata;
        int i2 = i + 111;
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.onConfigurationChanged onconfigurationchanged = (com.payair.hce.onConfigurationChanged) objArr[0];
        com.payair.hce.getPackageName getpackagename = (com.payair.hce.getPackageName) objArr[1];
        int i = getMchipCvmIssuerOptions;
        int i2 = i + 121;
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            onconfigurationchanged.IccPrivateKeyCrtComponentsJson = getpackagename;
            int i3 = i + 79;
            getAdditionalCheckTable = i3 % 128;
            if (i3 % 2 != 0) {
                return onconfigurationchanged;
            }
            throw new java.lang.ArithmeticException();
        }
        onconfigurationchanged.IccPrivateKeyCrtComponentsJson = getpackagename;
        throw null;
    }

    public final com.payair.hce.onConfigurationChanged AlternateContactlessPaymentDataJson(byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = new com.mastercard.mpsdk.card.profile.sdk.DigitizedCardJson().getCard(bArr);
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 31) % 128;
        return this;
    }

    public final com.payair.hce.onConfigurationChanged DigitizedCardProfile(com.payair.hce.setUpMCBP setupmcbp) {
        int i = getAdditionalCheckTable;
        getMchipCvmIssuerOptions = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        this.DigitizedCardProfile = setupmcbp;
        getMchipCvmIssuerOptions = (i + 35) % 128;
        return this;
    }

    public final com.payair.hce.onConfigurationChanged values(com.payair.hce.useDemoMode usedemomode) {
        int i = getAdditionalCheckTable + 11;
        int i2 = i % 128;
        getMchipCvmIssuerOptions = i2;
        if (i % 2 == 0) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = usedemomode;
            getAdditionalCheckTable = (i2 + 115) % 128;
            return this;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = usedemomode;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.onConfigurationChanged values(java.lang.String str) {
        int i = getMchipCvmIssuerOptions;
        int i2 = i + 11;
        getAdditionalCheckTable = i2 % 128;
        if (i2 % 2 != 0) {
            this.getAid = str;
            int i3 = i + 101;
            getAdditionalCheckTable = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }
        this.getAid = str;
        throw null;
    }

    public final com.payair.hce.onConfigurationChanged DigitizedCardProfile(com.payair.hce.getApplicationInfo getapplicationinfo) {
        int i = getMchipCvmIssuerOptions;
        getAdditionalCheckTable = (i + 29) % 128;
        this.getGpoResponse = getapplicationinfo;
        getAdditionalCheckTable = (i + 121) % 128;
        return this;
    }

    public final com.payair.hce.onConfigurationChanged valueOf(com.payair.hce.getOpPackageName getoppackagename) {
        int i = getAdditionalCheckTable + 107;
        getMchipCvmIssuerOptions = i % 128;
        if (i % 2 == 0) {
            getoppackagename.AlternateContactlessPaymentDataJson();
            getoppackagename.valueOf();
            getoppackagename.DigitizedCardProfile();
            this.SdkCoreBusinessLogicModuleImpl = getoppackagename;
            int i2 = getAdditionalCheckTable + 79;
            getMchipCvmIssuerOptions = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }
        getoppackagename.AlternateContactlessPaymentDataJson();
        getoppackagename.valueOf();
        getoppackagename.DigitizedCardProfile();
        this.SdkCoreBusinessLogicModuleImpl = getoppackagename;
        throw null;
    }

    public final com.payair.hce.onConfigurationChanged valueOf(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = getAdditionalCheckTable + 45;
        getMchipCvmIssuerOptions = i % 128;
        if (i % 2 == 0) {
            this.getPaymentFci = list;
            return this;
        }
        this.getPaymentFci = list;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.onConfigurationChanged writeReplace(java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list) {
        int i = getMchipCvmIssuerOptions + 87;
        int i2 = i % 128;
        getAdditionalCheckTable = i2;
        if (i % 2 != 0) {
            this.getCvrMaskAnd = list;
            int i3 = i2 + 69;
            getMchipCvmIssuerOptions = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }
        this.getCvrMaskAnd = list;
        throw null;
    }

    public final com.payair.hce.onConfigurationChanged DigitizedCardProfile(com.payair.hce.getErrors geterrors) {
        int i = getAdditionalCheckTable + 121;
        int i2 = i % 128;
        getMchipCvmIssuerOptions = i2;
        if (i % 2 == 0) {
            this.getDualTapResetTimeout = geterrors;
            getMchipCvmIssuerOptions = i2;
            return this;
        }
        this.getDualTapResetTimeout = geterrors;
        throw null;
    }

    public final com.payair.hce.onConfigurationChanged valueOf(com.payair.hce.obtainStyledAttributes obtainstyledattributes) {
        int i = getMchipCvmIssuerOptions;
        getAdditionalCheckTable = (i + 17) % 128;
        this.getCiacDecline = obtainstyledattributes;
        getAdditionalCheckTable = (i + 9) % 128;
        return this;
    }

    public final com.payair.hce.onConfigurationChanged DigitizedCardProfile(boolean z) {
        int i = getMchipCvmIssuerOptions + 85;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            this.getCardLayoutDescription = z;
            return this;
        }
        this.getCardLayoutDescription = z;
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0144, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0173, code lost:
    
        r12 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2};
        r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c0, code lost:
    
        if (r6 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c2, code lost:
    
        r6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3597, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1))))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0243, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r12)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0247, code lost:
    
        r8 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, java.lang.Integer.valueOf(r4), r2};
        r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0280, code lost:
    
        if (r6 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0282, code lost:
    
        r6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, 2665 - (android.os.Process.myTid() >> 22), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 18889));
        r12 = new java.lang.Object[1];
        b(0, 0, -1, r12);
        r6 = r6.getMethod((java.lang.String) r12[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02ec, code lost:
    
        r6 = ((java.lang.Integer) ((java.lang.reflect.Method) r6).invoke(null, r8)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02f9, code lost:
    
        r8 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r2.values] = r3[r6];
        r5[r2.values + 1] = r3[(r8 * r4) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x035d, code lost:
    
        r2.values += 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0312, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0314, code lost:
    
        com.payair.hce.onConfigurationChanged.$11 = (com.payair.hce.onConfigurationChanged.$10 + 87) % 128;
        r2.RecordsJson = ((r2.RecordsJson + r4) - 1) % r4;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r4) - 1) % r4;
        r6 = r2.DigitizedCardProfile;
        r8 = r2.RecordsJson;
        r14 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r2.values] = r3[(r6 * r4) + r8];
        r5[r2.values + 1] = r3[(r14 * r4) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0344, code lost:
    
        r6 = r2.DigitizedCardProfile;
        r8 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r12 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.RecordsJson;
        r5[r2.values] = r3[(r6 * r4) + r8];
        r5[r2.values + 1] = r3[(r12 * r4) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015a, code lost:
    
        r5[r2.values] = (char) (r2.valueOf - r31);
        r5[r2.values + 1] = (char) (r2.writeReplace - r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getApplicationLifeCycleData;
        long j = 0;
        int i3 = -1497284274;
        if (cArr != null) {
            int i4 = ($10 + 55) % 128;
            $11 = i4;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            $10 = (i4 + 63) % 128;
            int i5 = 0;
            while (i5 < length) {
                $11 = ($10 + 57) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i3));
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49, 2508 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.widget.ExpandableListView.getPackedPositionType(j) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(0, (short) 1, -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    j = 0;
                    i3 = -1497284274;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getCvmResetTimeout)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2508 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.text.TextUtils.getTrimmedLength("") + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(0, (short) 1, -1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 23) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i6 = $11 + 111;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            cArr3[i7] = (char) (cArr3[i7] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final com.payair.hce.sendRequest valueOf() {
        if (this.AlternateContactlessPaymentDataJson != null && this.values != null && this.valueOf != null && this.writeReplace != null) {
            int i = getAdditionalCheckTable + 85;
            int i2 = i % 128;
            getMchipCvmIssuerOptions = i2;
            if (i % 2 != 0) {
                throw null;
            }
            if (this.DigitizedCardProfile != null && this.SdkCoreAlternateContactlessPaymentDataImpl != null) {
                int i3 = (i2 + 17) % 128;
                getAdditionalCheckTable = i3;
                if (this.getAid != null) {
                    int i4 = i3 + 85;
                    int i5 = i4 % 128;
                    getMchipCvmIssuerOptions = i5;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    if (this.IccPrivateKeyCrtComponentsJson != null && this.RecordsJson != null && this.getGpoResponse != null) {
                        int i6 = i5 + 63;
                        getAdditionalCheckTable = i6 % 128;
                        if (i6 % 2 == 0) {
                            throw null;
                        }
                        if (this.SdkCoreBusinessLogicModuleImpl != null) {
                            return new com.payair.hce.onContextItemSelected(this.getAid, this.writeReplace, this.values, this.AlternateContactlessPaymentDataJson, this.valueOf, this.RecordsJson, this.getProfileVersion, this.getGpoResponse, this.IccPrivateKeyCrtComponentsJson, this.SdkCoreAlternateContactlessPaymentDataImpl, this.DigitizedCardProfile, this.getPaymentFci, this.getCvrMaskAnd, this.getDualTapResetTimeout, this.SdkCoreBusinessLogicModuleImpl, this.getCiacDecline, this.getCardLayoutDescription);
                        }
                    }
                }
            }
        }
        throw new java.lang.IllegalArgumentException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMchipCvmIssuerOptions = 0;
        getAdditionalCheckTable = 1;
        getApplicationLifeCycleData = new char[]{12302, 12289, 12303, 12337, 12394, 12313, 12336, 12338, 12342};
        getCvmResetTimeout = (char) 1491;
    }

    public final com.payair.hce.onConfigurationChanged values(boolean z) {
        return (com.payair.hce.onConfigurationChanged) valueOf(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, 556206952, -556206951, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.onConfigurationChanged AlternateContactlessPaymentDataJson(com.payair.hce.getPackageName getpackagename) {
        return (com.payair.hce.onConfigurationChanged) valueOf(new java.lang.Object[]{this, getpackagename}, -692469522, 692469524, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
    }

    public final com.payair.hce.onConfigurationChanged DigitizedCardProfile(com.payair.hce.VisaRepersoInitializer visaRepersoInitializer) {
        return (com.payair.hce.onConfigurationChanged) valueOf(new java.lang.Object[]{this, visaRepersoInitializer}, -414584072, 414584072, java.lang.System.identityHashCode(this));
    }
}
