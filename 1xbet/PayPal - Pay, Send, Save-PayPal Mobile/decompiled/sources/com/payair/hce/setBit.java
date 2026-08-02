package com.payair.hce;

/* loaded from: classes4.dex */
public final class setBit extends com.payair.hce.getContactlessSupported {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private static final com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static short[] SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static byte[] getCiacDecline;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static final com.payair.hce.transactionCanBeResumed values;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private com.payair.hce.getRequiredAutoMigrationSpecs IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.transactionCanBeResumed RecordsJson;
    private com.payair.hce.transactionCanBeResumed getProfileVersion;
    private com.payair.hce.transactionCanBeResumed valueOf;

    private static void b(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3 = i2 * 3;
        int i4 = 4 - (i * 3);
        byte[] bArr = $$a;
        int i5 = 104 - (b * 3);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 += -i3;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i5 += -bArr[i4];
                i4++;
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getGpoResponse = 1;
        AlternateContactlessPaymentDataJson();
        DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.visa.cbp.getEncExpo.IResultReceiver);
        values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 97});
        AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, com.visa.cbp.getEncExpo.IResultReceiver2});
        writeReplace = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE});
        getPaymentFci = (getGpoResponse + 7) % 128;
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.transactionCanBeResumed transactioncanberesumed3, com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs) {
        int i = (getGpoResponse + 43) % 128;
        getPaymentFci = i;
        this.valueOf = transactioncanberesumed;
        this.getProfileVersion = transactioncanberesumed2;
        this.RecordsJson = transactioncanberesumed3;
        this.IccPrivateKeyCrtComponentsJson = getrequiredautomigrationspecs;
        int i2 = i + 9;
        getGpoResponse = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs) {
        int i = getGpoResponse + 61;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            this.RecordsJson = transactioncanberesumed;
            this.IccPrivateKeyCrtComponentsJson = getrequiredautomigrationspecs;
        } else {
            this.RecordsJson = transactioncanberesumed;
            this.IccPrivateKeyCrtComponentsJson = getrequiredautomigrationspecs;
            throw null;
        }
    }

    @Override // com.payair.hce.getContactlessSupported
    public final void DigitizedCardProfile(com.payair.hce.access300 access300Var) throws com.payair.hce.getAtcCount {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (this.valueOf != null) {
                arrayList.add(new com.payair.hce.getWalletIdentificationDataProvider(values, this.valueOf));
            }
            if (this.getProfileVersion != null) {
                arrayList.add(new com.payair.hce.getWalletIdentificationDataProvider(AlternateContactlessPaymentDataJson, this.getProfileVersion));
            }
            arrayList.add(new com.payair.hce.getWalletIdentificationDataProvider(writeReplace, this.RecordsJson));
            com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs = this.IccPrivateKeyCrtComponentsJson;
            if (getrequiredautomigrationspecs != null) {
                getGpoResponse = (getPaymentFci + 85) % 128;
                arrayList.add(getrequiredautomigrationspecs.SdkCoreAlternateContactlessPaymentDataImpl());
            }
            super.valueOf(new com.payair.hce.getWalletIdentificationDataProvider(DigitizedCardProfile, arrayList));
            getGpoResponse = (getPaymentFci + 31) % 128;
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            android.media.AudioTrack.getMaxVolume();
            android.view.View.resolveSize(0, 0);
            android.graphics.Color.alpha(0);
            android.view.View.MeasureSpec.getSize(0);
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.media.AudioTrack.getMaxVolume();
        android.view.ViewConfiguration.getEdgeSlop();
        android.text.TextUtils.indexOf("", "", 0, 0);
        android.view.ViewConfiguration.getFadingEdgeLength();
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        new java.lang.Object[]{getClass().getSimpleName()};
        android.view.View.resolveSize(0, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.widget.ExpandableListView.getPackedPositionChild(0L);
        android.util.TypedValue.complexToFloat(0);
        android.view.ViewConfiguration.getScrollBarSize();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.valueOf;
        if (transactioncanberesumed != null) {
            int i = getPaymentFci + 65;
            getGpoResponse = i % 128;
            if (i % 2 == 0) {
                transactioncanberesumed.writeReplace();
                throw null;
            }
            str = transactioncanberesumed.writeReplace();
        } else {
            str = "";
        }
        new java.lang.Object[]{str};
        android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.View.MeasureSpec.getSize(0);
        android.view.Gravity.getAbsoluteGravity(0, 0);
        android.view.ViewConfiguration.getLongPressTimeout();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = this.getProfileVersion;
        if (transactioncanberesumed2 != null) {
            int i2 = getPaymentFci + 87;
            getGpoResponse = i2 % 128;
            if (i2 % 2 == 0) {
                transactioncanberesumed2.writeReplace();
                throw new java.lang.ArithmeticException();
            }
            str2 = transactioncanberesumed2.writeReplace();
        } else {
            str2 = "";
        }
        new java.lang.Object[]{str2};
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        android.text.TextUtils.indexOf("", "", 0);
        android.os.Process.getGidForName("");
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        android.text.TextUtils.indexOf("", "");
        com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = this.RecordsJson;
        if (transactioncanberesumed3 != null) {
            int i3 = getGpoResponse + 9;
            getPaymentFci = i3 % 128;
            if (i3 % 2 != 0) {
                transactioncanberesumed3.writeReplace();
                throw new java.lang.ArithmeticException();
            }
            str3 = transactioncanberesumed3.writeReplace();
        } else {
            getPaymentFci = (getGpoResponse + 69) % 128;
            str3 = "";
        }
        new java.lang.Object[]{str3};
        try {
            android.view.View.combineMeasuredStates(0, 0);
            android.os.Process.myTid();
            android.view.KeyEvent.getModifierMetaStateMask();
            android.view.ViewConfiguration.getTapTimeout();
            android.os.Process.getElapsedCpuTime();
            com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs = this.IccPrivateKeyCrtComponentsJson;
            if (getrequiredautomigrationspecs != null) {
                getGpoResponse = (getPaymentFci + 105) % 128;
                str4 = com.payair.hce.onRequestSessionCompleted.valueOf(getrequiredautomigrationspecs.writeReplace());
            } else {
                str4 = "";
            }
            new java.lang.Object[]{str4};
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
        }
        android.text.TextUtils.indexOf("", "");
        android.text.TextUtils.indexOf("", "", 0);
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.os.Process.getElapsedCpuTime();
        android.view.View.resolveSize(0, 0);
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
        int jumpTapTimeout = android.view.ViewConfiguration.getJumpTapTimeout();
        int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-1662323461) - (windowTouchSlop >> 8), (-1499183697) - (jumpTapTimeout >> 16), (-54) - (keyRepeatDelay >> 16), (byte) android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
        return ((java.lang.String) objArr[0]).intern();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getAid)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "") + 29, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                i4 = 1;
            } else {
                $10 = ($11 + 91) % 128;
                i4 = 0;
            }
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i4 != 0) {
                byte[] bArr2 = getCiacDecline;
                if (bArr2 != null) {
                    int i6 = $10 + 37;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i5])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", c, 0) + 32, 5087 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr[i5] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i5++;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 == null) {
                    j = -4897270311952305750L;
                    intValue = (short) (((short) (SdkCoreBusinessLogicModuleImpl[i2 + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
                    if (intValue > 0) {
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ j)) + i4;
                        java.lang.Object[] objArr4 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getCvrMaskAnd), sb};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj3 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 27, 2412 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.text.TextUtils.getOffsetBefore("", 0));
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            b(0, (byte) 0, 0, objArr5);
                            obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj3);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr3 = getCiacDecline;
                        if (bArr3 != null) {
                            int length2 = bArr3.length;
                            byte[] bArr4 = new byte[length2];
                            for (int i7 = 0; i7 < length2; i7++) {
                                bArr4[i7] = (byte) (bArr3[i7] ^ (-4897270311952305750L));
                            }
                            bArr3 = bArr4;
                        }
                        boolean z = bArr3 != null;
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr5 = getCiacDecline;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr5[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = SdkCoreBusinessLogicModuleImpl;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                $11 = ($10 + 75) % 128;
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                }
                $10 = ($11 + 11) % 128;
                byte[] bArr6 = getCiacDecline;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj4);
                }
                intValue = (byte) (((byte) (bArr6[((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).intValue()] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
            }
            j = -4897270311952305750L;
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void AlternateContactlessPaymentDataJson() {
        SdkCoreAlternateContactlessPaymentDataImpl = 1180666654;
        getAid = 520368543;
        getCvrMaskAnd = 2081503970;
        getCiacDecline = new byte[]{84, 88, -81, 85, 85, 87, -92, -71, -104, com.visa.cbp.getEncExpo.IResultReceiver, -86, -86, -119, 19, 83, -81, -81, 82, -87, 94, -71, -24, 17, 83, -87, -85, 91, -3, 6, -69, 84, 81, -94, -71, -123, com.visa.cbp.getEncExpo.IResultReceiver2, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 82, -98, 17, 88, -85, -69, 91, -6, 6, -81, -85, -86, -89, -76, 100, 109, -28, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -28, 66, -95, 109, -94, -88, 69, -76, -117, 122, 71, com.visa.cbp.getEncExpo.registerForActivityResult, 124, -72, 115, -28, 66, -90, 108, -94, -88, 69, -76, -117, 122, 71, com.visa.cbp.getEncExpo.registerForActivityResult, 124, 120, -28, 66, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 69, com.visa.cbp.getEncExpo.registerForActivityResult, 126, 121, 126, -86, -84, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -82, -75, 73, 102, 89, -69, 94, -123, 118, 88, -81, 85, 85, 87, -92, -71, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 82, -88, -94, -94, 84, 87, -113, 74, 80, -85, 82, -91, 69, -95, 82, 81, -82, 93, -83, -123, 116, 91, 85, -81, -87, 84, -122};
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = 167;
    }
}
