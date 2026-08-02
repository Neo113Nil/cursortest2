package com.payair.hce;

/* loaded from: classes10.dex */
public final class CardRiskManagementData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char SdkCoreCardRiskManagementDataImpl;
    private static int getAdditionalCheckTable;
    private static char[] getMagstripeCvmIssuerOptions;
    private static int getMchipCvmIssuerOptions;
    private com.payair.hce.setCardProfile getApplicationLifeCycleData;
    private com.payair.hce.getIsRedigitization getCardholderValidators;
    private java.lang.String getDualTapResetTimeout;
    private com.payair.hce.setMagstripeCvmIssuerOptions values;
    private com.payair.hce.setMChipCvmIssuerOptions writeReplace;
    private java.lang.String AlternateContactlessPaymentDataJson = null;
    private java.lang.String valueOf = null;
    private java.lang.String DigitizedCardProfile = null;
    private java.lang.String RecordsJson = null;
    private java.lang.String getAid = "";
    private com.payair.hce.setIccKek IccPrivateKeyCrtComponentsJson = new com.payair.hce.getPaymentAppProviderId();
    private boolean getProfileVersion = false;
    private boolean SdkCoreAlternateContactlessPaymentDataImpl = false;
    private boolean getGpoResponse = true;
    private int getCvrMaskAnd = 16;
    private com.payair.hce.setExpiryTimestamp getPaymentFci = com.payair.hce.setCardLayoutDescription.getProfileVersion;
    private com.payair.hce.ProvisionResponseEncrypted getCiacDecline = com.payair.hce.setCardLayoutDescription.getAid;
    private boolean SdkCoreBusinessLogicModuleImpl = true;
    private boolean getCardLayoutDescription = true;
    private com.payair.hce.DeleteCardResponseEncrypted getCvmResetTimeout = com.payair.hce.setCardLayoutDescription.IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.getCardProfile getSecurityWord = com.payair.hce.setCardLayoutDescription.RecordsJson;

    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2 = s * 3;
        int i3 = 73 - (b * 8);
        int i4 = (i * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = i4 + i5;
            i4++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i3;
            i6 = i7;
            i3 = bArr[i4] + i8;
            i4++;
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        int i8 = (i * (-919)) + (i2 * (-919)) + (((~(i6 | i3)) | (~(i5 | i7 | i))) * 920) + (((~i6) | (~(i4 | i7))) * 920) + (((~(i | i5 | i3)) | (~(i2 | i4 | i3)) | (~(i6 | i7))) * 920);
        if (i8 == 1) {
            com.payair.hce.CardRiskManagementData cardRiskManagementData = (com.payair.hce.CardRiskManagementData) objArr[0];
            getMchipCvmIssuerOptions = (getAdditionalCheckTable + 91) % 128;
            cardRiskManagementData.writeReplace.DigitizedCardProfile(96);
            getMchipCvmIssuerOptions = (getAdditionalCheckTable + 65) % 128;
            return cardRiskManagementData;
        }
        if (i8 != 2) {
            return writeReplace(objArr);
        }
        com.payair.hce.CardRiskManagementData cardRiskManagementData2 = (com.payair.hce.CardRiskManagementData) objArr[0];
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 75) % 128;
        cardRiskManagementData2.writeReplace.writeReplace();
        cardRiskManagementData2.SdkCoreAlternateContactlessPaymentDataImpl = true;
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 107) % 128;
        return cardRiskManagementData2;
    }

    public CardRiskManagementData() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u001c\u0004\u0017\u0016\u0014\u001c\u0017\n\u0017\u0010\u0014\u001c\u001b\t\u0012\t\u0012\n\u0016!\u0016\u0013\u0016\t\u0017\u0016\u0013\u001c\u0017\n\u0013\u001b\u0017\u0010 \u001c#\u0010\u0013\u001b\u0017\u0010\u0017\n\u001e\u0016\u001c\u0004\u001b\t\u0012\t\u0012\n\u0016!\u0016\u0013", 58 - android.view.View.MeasureSpec.getSize(0), (byte) (67 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
        this.getDualTapResetTimeout = ((java.lang.String) objArr[0]).intern();
        this.getApplicationLifeCycleData = com.payair.hce.setCardLayoutDescription.SdkCoreAlternateContactlessPaymentDataImpl;
        this.getCardholderValidators = com.payair.hce.setCardLayoutDescription.getCvrMaskAnd;
        this.writeReplace = new com.payair.hce.setMChipCvmIssuerOptions();
        this.values = new com.payair.hce.setMagstripeCvmIssuerOptions();
        com.payair.hce.getExpiryTimestamp.DigitizedCardProfile();
        com.payair.hce.getExpiryTimestamp.DigitizedCardProfile();
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = this.writeReplace;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\u001c\u0012", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, (byte) (120 - android.view.View.MeasureSpec.getMode(0)), objArr2);
        setmchipcvmissueroptions.valueOf(com.payair.hce.getExpiryTimestamp.writeReplace(((java.lang.String) objArr2[0]).intern()));
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions2 = this.writeReplace;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\u001c\u0012", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2, (byte) (120 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr3);
        setmchipcvmissueroptions2.AlternateContactlessPaymentDataJson(com.payair.hce.getExpiryTimestamp.values(((java.lang.String) objArr3[0]).intern()));
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions3 = this.writeReplace;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("\u001c\u0012", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1, (byte) (120 - android.text.TextUtils.indexOf("", "")), objArr4);
        setmchipcvmissueroptions3.DigitizedCardProfile(com.payair.hce.getExpiryTimestamp.DigitizedCardProfile(((java.lang.String) objArr4[0]).intern()));
    }

    public final com.payair.hce.CardRiskManagementData AlternateContactlessPaymentDataJson() {
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 31) % 128;
        this.getGpoResponse = false;
        java.lang.String str = this.AlternateContactlessPaymentDataJson;
        this.valueOf = str;
        this.writeReplace.valueOf(str);
        int i = getMchipCvmIssuerOptions + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw null;
    }

    public final com.payair.hce.CardRiskManagementData writeReplace(java.lang.String str) {
        int i = getMchipCvmIssuerOptions + 13;
        getAdditionalCheckTable = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.setDualTapResetTimeout setdualtapresettimeout = com.payair.hce.setDualTapResetTimeout.DigitizedCardProfile;
            this.AlternateContactlessPaymentDataJson = str;
            throw null;
        }
        com.payair.hce.setDualTapResetTimeout setdualtapresettimeout2 = com.payair.hce.setDualTapResetTimeout.DigitizedCardProfile;
        this.AlternateContactlessPaymentDataJson = str;
        if (this.getGpoResponse) {
            int i2 = getMchipCvmIssuerOptions + 43;
            getAdditionalCheckTable = i2 % 128;
            if (i2 % 2 == 0) {
                setdualtapresettimeout2.DigitizedCardProfile(str);
                throw null;
            }
            str = setdualtapresettimeout2.DigitizedCardProfile(str);
        }
        this.valueOf = str;
        this.writeReplace.valueOf(str);
        return this;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.CardRiskManagementData cardRiskManagementData = (com.payair.hce.CardRiskManagementData) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = getAdditionalCheckTable + 33;
        getMchipCvmIssuerOptions = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = cardRiskManagementData.writeReplace;
            cardRiskManagementData.DigitizedCardProfile = str;
            int i2 = getMchipCvmIssuerOptions + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getAdditionalCheckTable = i2 % 128;
            if (i2 % 2 != 0) {
                return cardRiskManagementData;
            }
            throw null;
        }
        com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions2 = cardRiskManagementData.writeReplace;
        cardRiskManagementData.DigitizedCardProfile = str;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.CardRiskManagementData AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = getMchipCvmIssuerOptions + 19;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            this.writeReplace.AlternateContactlessPaymentDataJson(str);
            this.RecordsJson = str;
            return this;
        }
        this.writeReplace.AlternateContactlessPaymentDataJson(str);
        this.RecordsJson = str;
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.CardRiskManagementData writeReplace() {
        boolean z;
        int i = getMchipCvmIssuerOptions + 65;
        getAdditionalCheckTable = i % 128;
        if (i % 2 == 0) {
            this.writeReplace.valueOf();
            z = false;
        } else {
            this.writeReplace.valueOf();
            z = true;
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = z;
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 43) % 128;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013a, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
    
        r14 = new java.lang.Object[13];
        r14[12] = r3;
        r14[11] = java.lang.Integer.valueOf(r2);
        r14[10] = r3;
        r14[9] = r3;
        r14[8] = java.lang.Integer.valueOf(r2);
        r14[7] = r3;
        r14[6] = r3;
        r14[5] = java.lang.Integer.valueOf(r2);
        r14[4] = r3;
        r14[3] = r3;
        r14[2] = java.lang.Integer.valueOf(r2);
        r14[r9] = r3;
        r14[0] = r3;
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b9, code lost:
    
        if (r7 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bb, code lost:
    
        r7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.Process.myPid() >> 22), 3596 - android.view.KeyEvent.getDeadChar(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(r11))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0233, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r14)).intValue() != r3.SdkCoreAlternateContactlessPaymentDataImpl) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0235, code lost:
    
        com.payair.hce.CardRiskManagementData.$10 = (com.payair.hce.CardRiskManagementData.$11 + 69) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023f, code lost:
    
        r9 = new java.lang.Object[]{r3, r3, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r2), r3, r3, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r2), r3, java.lang.Integer.valueOf(r2), r3};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027c, code lost:
    
        if (r7 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027e, code lost:
    
        r7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2665 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 18890));
        r15 = new java.lang.Object[1];
        b(0, 0, (byte) 0, r15);
        r7 = r7.getMethod((java.lang.String) r15[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02ef, code lost:
    
        r14 = null;
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02fc, code lost:
    
        r9 = r3.AlternateContactlessPaymentDataJson;
        r15 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r3.values] = r4[r7];
        r5[r3.values + 1] = r4[(r9 * r2) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x034b, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0367, code lost:
    
        r3.values += 2;
        com.payair.hce.CardRiskManagementData.$11 = (com.payair.hce.CardRiskManagementData.$10 + 29) % 128;
        r7 = r14;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0311, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0318, code lost:
    
        if (r3.DigitizedCardProfile != r3.AlternateContactlessPaymentDataJson) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x031a, code lost:
    
        com.payair.hce.CardRiskManagementData.$10 = (com.payair.hce.CardRiskManagementData.$11 + 73) % 128;
        r3.RecordsJson = ((r3.RecordsJson + r2) - 1) % r2;
        r3.SdkCoreAlternateContactlessPaymentDataImpl = ((r3.SdkCoreAlternateContactlessPaymentDataImpl + r2) - 1) % r2;
        r7 = r3.DigitizedCardProfile;
        r9 = r3.RecordsJson;
        r11 = r3.AlternateContactlessPaymentDataJson;
        r12 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r3.values] = r4[(r7 * r2) + r9];
        r5[r3.values + 1] = r4[(r11 * r2) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x034d, code lost:
    
        r7 = r3.DigitizedCardProfile;
        r9 = r3.SdkCoreAlternateContactlessPaymentDataImpl;
        r11 = r3.AlternateContactlessPaymentDataJson;
        r12 = r3.RecordsJson;
        r5[r3.values] = r4[(r7 * r2) + r9];
        r9 = 1;
        r5[r3.values + 1] = r4[(r11 * r2) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        r5[r3.values] = (char) (r3.valueOf - r29);
        r5[r3.values + r9] = (char) (r3.writeReplace - r29);
        r14 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r3.valueOf == r3.writeReplace) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = $11;
        $10 = (i3 + 97) % 128;
        if (str != null) {
            int i4 = i3 + 31;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = getMagstripeCvmIssuerOptions;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        java.lang.Object obj = null;
        int i5 = 1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i6])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", c, 0) + 50, android.text.TextUtils.lastIndexOf("", c) + 2509, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) 0, 0, (byte) 1, objArr3);
                        obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).charValue();
                    i6++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(SdkCoreCardRiskManagementDataImpl)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj3 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.alpha(0), 2509 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (6802 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) 0, 0, (byte) 1, objArr5);
            obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $10 = ($11 + 85) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i7 = $10 + 21;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + i5];
                }
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            cArr5[i8] = (char) (cArr5[i8] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    public final com.payair.hce.CardRiskManagementData DigitizedCardProfile() {
        boolean z;
        int i = getAdditionalCheckTable + 103;
        getMchipCvmIssuerOptions = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions = this.writeReplace;
            z = false;
        } else {
            com.payair.hce.setMChipCvmIssuerOptions setmchipcvmissueroptions2 = this.writeReplace;
            z = true;
        }
        this.getProfileVersion = z;
        return this;
    }

    public final com.payair.hce.CardRiskManagementData valueOf() {
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 79) % 128;
        this.writeReplace.DigitizedCardProfile();
        this.SdkCoreAlternateContactlessPaymentDataImpl = true;
        getAdditionalCheckTable = (getMchipCvmIssuerOptions + 29) % 128;
        return this;
    }

    public final com.payair.hce.CardRiskManagementData RecordsJson() {
        getMchipCvmIssuerOptions = (getAdditionalCheckTable + 13) % 128;
        getAdditionalCheckTable = (getMchipCvmIssuerOptions + 73) % 128;
        return this;
    }

    public final com.payair.hce.CardRiskManagementData values(java.lang.String str) {
        int i = getMchipCvmIssuerOptions;
        getAdditionalCheckTable = (i + 121) % 128;
        this.getAid = str;
        getAdditionalCheckTable = (i + 115) % 128;
        return this;
    }

    public final com.payair.hce.CardRiskManagementData IccPrivateKeyCrtComponentsJson() {
        int i = getMchipCvmIssuerOptions + 97;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            this.writeReplace.AlternateContactlessPaymentDataJson();
            return this;
        }
        this.writeReplace.AlternateContactlessPaymentDataJson();
        throw null;
    }

    public final com.payair.hce.CardRiskManagementData DigitizedCardProfile(com.payair.hce.setIccKek seticckek) {
        int i = (getMchipCvmIssuerOptions + 59) % 128;
        getAdditionalCheckTable = i;
        this.IccPrivateKeyCrtComponentsJson = seticckek;
        getMchipCvmIssuerOptions = (i + 91) % 128;
        return this;
    }

    public final java.lang.String SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = getAdditionalCheckTable + 1;
        getMchipCvmIssuerOptions = i % 128;
        com.payair.hce.setIccKek seticckek = this.IccPrivateKeyCrtComponentsJson;
        if (i % 2 == 0) {
            return seticckek.valueOf(getAid());
        }
        seticckek.valueOf(getAid());
        throw new java.lang.ArithmeticException();
    }

    private com.payair.hce.setStatus getAid() {
        com.payair.hce.setStatus setstatus = new com.payair.hce.setStatus();
        com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus, this.values.valueOf()}, 254892728, -254892719, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus, this.writeReplace.SdkCoreAlternateContactlessPaymentDataImpl()}, -1412922979, 1412922991, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus, java.lang.Boolean.valueOf(this.getProfileVersion)}, -907266543, 907266546, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus, java.lang.Boolean.valueOf(this.SdkCoreAlternateContactlessPaymentDataImpl)}, 1341419562, -1341419555, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus, this.getAid}, -1602669232, 1602669238, java.lang.System.identityHashCode(setstatus));
        com.payair.hce.setStatus.values(new java.lang.Object[]{setstatus, SdkCoreBusinessLogicModuleImpl()}, -441834918, 441834918, java.lang.System.identityHashCode(setstatus));
        int i = getMchipCvmIssuerOptions + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getAdditionalCheckTable = i % 128;
        if (i % 2 != 0) {
            return setstatus;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.String SdkCoreBusinessLogicModuleImpl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.valueOf);
        int length = this.valueOf.length();
        while (length < 20) {
            int i = getMchipCvmIssuerOptions + 39;
            getAdditionalCheckTable = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("㘾", 0 - android.graphics.Color.green(0), (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) * 121), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                length += 65;
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("㘾", android.graphics.Color.green(0) + 1, (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 98), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                length++;
            }
        }
        sb.append(this.RecordsJson);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("㗺㗺㗮㗮㘕㘕㗩㗩㘎㘎㘀㘀", android.graphics.Color.argb(0, 0, 0, 0) + 12, (byte) (24 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr3);
        sb.append(new java.text.SimpleDateFormat(((java.lang.String) objArr3[0]).intern()).format(java.util.Calendar.getInstance().getTime()));
        return sb.toString();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMchipCvmIssuerOptions = 0;
        getAdditionalCheckTable = 1;
        getMagstripeCvmIssuerOptions = new char[]{12313, 12400, 12312, 12296, 12291, 12336, 12411, 12335, 12323, 12295, 12297, 12410, 12299, 12348, 12315, 12324, 12314, 12403, 12408, 12316, 12334, 12414, 12409, 12327, 12300, 12413, 12402, 12339, 12331, 12321, 12345, 12290, 12394, 12326, 12415, 12317};
        SdkCoreCardRiskManagementDataImpl = (char) 1494;
    }

    private com.payair.hce.CardRiskManagementData getProfileVersion() {
        return (com.payair.hce.CardRiskManagementData) values(new java.lang.Object[]{this}, -1975873210, 1975873211, java.lang.System.identityHashCode(this));
    }

    public final com.payair.hce.CardRiskManagementData values() {
        return (com.payair.hce.CardRiskManagementData) values(new java.lang.Object[]{this}, -1804161744, 1804161746, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{16, -36, 67, -117};
        $$b = 47;
    }

    public final com.payair.hce.CardRiskManagementData valueOf(java.lang.String str) {
        return (com.payair.hce.CardRiskManagementData) values(new java.lang.Object[]{this, str}, 358732784, -358732784, java.lang.System.identityHashCode(this));
    }
}
