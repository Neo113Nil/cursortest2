package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTrack2EquivalentData extends com.payair.hce.initialize {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char SdkCoreCardRiskManagementDataImpl;
    private static int getAdditionalCheckTable;
    private static char getCardLayoutDescription;
    private static int getCardholderValidators;
    private static char[] getCvmResetTimeout;
    private static long getDualTapResetTimeout;
    private static char getMagstripeCvmIssuerOptions;
    private static char getSecurityWord;
    private com.payair.hce.transactionCanBeResumed RecordsJson;
    private com.payair.hce.setRecordValue SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.transactionCanBeResumed SdkCoreBusinessLogicModuleImpl;
    private com.payair.hce.transactionCanBeResumed getAid;
    private final com.payair.hce.transactionCanBeResumed getApplicationLifeCycleData;
    private com.payair.hce.transactionCanBeResumed getCiacDecline;
    private com.payair.hce.transactionCanBeResumed getCvrMaskAnd;
    private final com.payair.hce.transactionCanBeResumed getGpoResponse;
    private com.payair.hce.getSelectedCard getPaymentFci;
    private com.payair.hce.transactionCanBeResumed getProfileVersion;

    private static void b(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i = (s * 3) + 99;
        int i2 = b2 + 4;
        int i3 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i = (-i) + i4;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i = (-bArr[i7]) + i;
            i2 = i7;
            i5 = i6;
        }
    }

    public setTrack2EquivalentData(com.payair.hce.hasVersionCheckFailed hasversioncheckfailed) throws com.payair.hce.updateSukFileName {
        super(hasversioncheckfailed.DigitizedCardProfile());
        com.payair.hce.unsuspendTokens values = hasversioncheckfailed.values();
        if (values.DigitizedCardProfile() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCardholderValidators);
        }
        this.valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.DigitizedCardProfile());
        if (this.valueOf.DigitizedCardProfile() < 18) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getMaximumPinTry);
        }
        if (values.writeReplace() == null || values.writeReplace().length <= 0) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCrmCountryCode);
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = new com.payair.hce.setRecordValue(values.writeReplace());
        if (values.valueOf() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.SdkCoreContactlessPaymentDataImpl);
        }
        this.getProfileVersion = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.valueOf());
        if (values.AlternateContactlessPaymentDataJson() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCdol1RelatedDataLength);
        }
        this.RecordsJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.AlternateContactlessPaymentDataJson());
        if (values.IccPrivateKeyCrtComponentsJson() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getIccPrivateKeyCrtComponents);
        }
        if (values.IccPrivateKeyCrtComponentsJson()[0] > 9) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getIccPrivateKeyCrtComponents);
        }
        this.getAid = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.IccPrivateKeyCrtComponentsJson());
        if (values.values() != null) {
            this.getCiacDecline = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.values());
        }
        if (values.getAid() != null) {
            this.SdkCoreBusinessLogicModuleImpl = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.getAid());
        }
        if (values.getCvrMaskAnd() != null) {
            this.getCvrMaskAnd = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(values.getCvrMaskAnd());
        }
        this.values = values.getProfileVersion();
        this.AlternateContactlessPaymentDataJson = values.SdkCoreAlternateContactlessPaymentDataImpl();
        this.getPaymentFci = values.RecordsJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.graphics.Color.rgb(0, 0, 0) + 16806190), 11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        this.getGpoResponse = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.os.Process.getGidForName("") + 1, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28975), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 12, objArr2);
        this.getApplicationLifeCycleData = com.payair.hce.transactionCanBeResumed.values(((java.lang.String) objArr2[0]).intern());
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $10 + 63;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getCvmResetTimeout[i >>> getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 48, android.graphics.Color.argb(0, 0, 0, 0) + 381, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62387));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((byte) 0, (short) 0, (byte) -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getDualTapResetTimeout), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 35, android.view.View.combineMeasuredStates(0, 0) + 3966, (char) (40223 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(getCvmResetTimeout[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, 381 - android.view.KeyEvent.keyCodeFromString(""), (char) (62389 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, (byte) -1, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getDualTapResetTimeout), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3965 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (40223 - android.view.View.resolveSize(0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 35, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 79;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 34, android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.combineMeasuredStates(0, 0), 212 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final com.payair.hce.transactionCanBeResumed valueOf() {
        int i = getAdditionalCheckTable + 95;
        int i2 = i % 128;
        getCardholderValidators = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.SdkCoreBusinessLogicModuleImpl;
        getAdditionalCheckTable = (i2 + 117) % 128;
        return transactioncanberesumed;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.text.TextUtils.indexOf("", "", 0);
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.os.Process.myTid();
        android.graphics.ImageFormat.getBitsPerPixel(0);
        new java.lang.Object[]{getAid().writeReplace()};
        android.view.ViewConfiguration.getDoubleTapTimeout();
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        new java.lang.Object[]{getCiacDecline().writeReplace()};
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        new java.lang.Object[]{getGpoResponse()};
        android.graphics.ImageFormat.getBitsPerPixel(0);
        new java.lang.Object[]{getCvrMaskAnd()};
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.os.SystemClock.currentThreadTimeMillis();
        android.text.TextUtils.getCapsMode("", 0, 0);
        new java.lang.Object[]{java.lang.Boolean.valueOf(SdkCoreBusinessLogicModuleImpl())};
        android.graphics.ImageFormat.getBitsPerPixel(0);
        android.view.ViewConfiguration.getTouchSlop();
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.text.TextUtils.getTrimmedLength("");
        android.os.Process.getGidForName("");
        new java.lang.Object[]{this.SdkCoreAlternateContactlessPaymentDataImpl.DigitizedCardProfile().DigitizedCardProfile()};
        android.view.ViewConfiguration.getDoubleTapTimeout();
        new java.lang.Object[]{this.getProfileVersion.writeReplace()};
        android.view.View.resolveSizeAndState(0, 0, 0);
        new java.lang.Object[]{this.RecordsJson.writeReplace()};
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        new java.lang.Object[]{this.getAid.writeReplace()};
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.getCiacDecline;
        if (transactioncanberesumed != null) {
            str = transactioncanberesumed.writeReplace();
        } else {
            int i = getAdditionalCheckTable + 31;
            getCardholderValidators = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 / 5;
            }
            str = "";
        }
        new java.lang.Object[]{str};
        android.graphics.Color.argb(0, 0, 0, 0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = this.SdkCoreBusinessLogicModuleImpl;
        if (transactioncanberesumed2 == null) {
            str2 = "";
        } else {
            str2 = transactioncanberesumed2.writeReplace();
        }
        new java.lang.Object[]{str2};
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        android.media.AudioTrack.getMaxVolume();
        android.text.TextUtils.getCapsMode("", 0, 0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = this.getCvrMaskAnd;
        if (transactioncanberesumed3 == null) {
            str3 = "";
        } else {
            int i3 = getAdditionalCheckTable + 21;
            getCardholderValidators = i3 % 128;
            if (i3 % 2 == 0) {
                transactioncanberesumed3.writeReplace();
                throw null;
            }
            str3 = transactioncanberesumed3.writeReplace();
        }
        new java.lang.Object[]{str3};
        android.view.KeyEvent.keyCodeFromString("");
        new java.lang.Object[]{this.getPaymentFci};
        android.view.ViewConfiguration.getScrollFriction();
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.view.KeyEvent.normalizeMetaState(0) + 125, (char) android.view.View.resolveSize(0, 0), android.graphics.Color.green(0) + 15, objArr);
        return ((java.lang.String) objArr[0]).intern();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAdditionalCheckTable = 0;
        getCardholderValidators = 1;
        getCvmResetTimeout = new char[]{12231, 12050, 11803, 11726, 11493, 11160, 11087, 10850, 10521, 10444, 10211, 9878, 20669, 20574, 20751, 21240, 21440, 21675, 21595, 21850, 22075, 22517, 22720, 22963, 22883, 23156, 23343, 23801, 24019, 24318, 24121, 24410, 27155, 27387, 27573, 26735, 26903, 28274, 28403, 6277, 6218, 6418, 6881, 7129, 7339, 7265, 7518, 7719, 8165, 4311, 4516, 4478, 4724, 4910, 5317, 5593, 5816, 5731, 5962, 2106, 2544, 2758, 3058, 2865, 3154, 54195, 24258, 24127, 24445, 23712, 23954, 23284, 23088, 23304, 22638, 22973, 22163, 22476, 22322, 21514, 21868, 21225, 21466, 20729, 37662, 37861, 37551, 37246, 36970, 38715, 38910, 38603, 38298, 37984, 39749, 39529, 39594, 39377, 24258, 24106, 24420, 23721, 23958, 23267, 23103, 23304, 22598, 22961, 22174, 22503, 22310, 21520, 21885, 21126, 21402, 20716, 20528, 20754, 20078, 20408, 19586, 19945, 19818, 19015, 19326, 24299, 24073, 24439, 23712, 23979, 23284, 23102, 23322, 22638, 22974, 22168, 22476, 22322, 21514, 21864};
        getDualTapResetTimeout = 678058593219665530L;
        getCardLayoutDescription = (char) 28838;
        getSecurityWord = (char) 59267;
        getMagstripeCvmIssuerOptions = (char) 18107;
        SdkCoreCardRiskManagementDataImpl = (char) 6233;
    }

    static void init$0() {
        $$a = new byte[]{108, -72, 46, 57};
        $$b = 204;
    }
}
