package com.payair.hce;

/* loaded from: classes4.dex */
public final class setPinAlwaysRequiredIfCurrencyProvided extends com.payair.hce.getContactlessSupported {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static char[] getCvrMaskAnd;
    private static int getGpoResponse;
    private static char getPaymentFci;
    private static final com.payair.hce.transactionCanBeResumed valueOf;
    private static final com.payair.hce.transactionCanBeResumed values;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private com.payair.hce.clearAllTables AlternateContactlessPaymentDataJson;
    private com.payair.hce.createInvalidationTracker DigitizedCardProfile;
    private com.payair.hce.transactionCanBeResumed IccPrivateKeyCrtComponentsJson;
    private com.payair.hce.setCiacDeclineOnPpms RecordsJson;
    private com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.getRequiredAutoMigrationSpecs getAid;
    private boolean getProfileVersion = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = s + 4;
        int i4 = i * 2;
        int i5 = 73 - (b * 8);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            int i8 = 0;
            int i9 = i3 + i7;
            i2 = i8;
            int i10 = i6;
            i5 = i9;
            i3 = i10;
            bArr2[i2] = (byte) i5;
            int i11 = i3 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i6 = i11;
            i3 = bArr[i11];
            i8 = i2 + 1;
            i7 = i12;
            int i92 = i3 + i7;
            i2 = i8;
            int i102 = i6;
            i5 = i92;
            i3 = i102;
            bArr2[i2] = (byte) i5;
            int i112 = i3 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            int i1122 = i3 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        getGpoResponse = 1;
        AlternateContactlessPaymentDataJson();
        writeReplace = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.visa.cbp.getEncExpo.IResultReceiver);
        valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 75});
        values = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 38});
        int i = getGpoResponse + 101;
        getCiacDecline = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final void writeReplace(com.payair.hce.createInvalidationTracker createinvalidationtracker, com.payair.hce.clearAllTables clearalltables, com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.setCiacDeclineOnPpms setciacdeclineonppms, com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs) {
        getCiacDecline = (getGpoResponse + 61) % 128;
        this.getProfileVersion = true;
        this.DigitizedCardProfile = createinvalidationtracker;
        this.AlternateContactlessPaymentDataJson = clearalltables;
        this.SdkCoreAlternateContactlessPaymentDataImpl = transactioncanberesumed;
        this.IccPrivateKeyCrtComponentsJson = null;
        this.RecordsJson = setciacdeclineonppms;
        this.getAid = getrequiredautomigrationspecs;
    }

    public final void DigitizedCardProfile(com.payair.hce.createInvalidationTracker createinvalidationtracker, com.payair.hce.clearAllTables clearalltables, com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.setCiacDeclineOnPpms setciacdeclineonppms, com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs) {
        int i = getCiacDecline + 119;
        int i2 = i % 128;
        getGpoResponse = i2;
        this.getProfileVersion = i % 2 == 0;
        this.DigitizedCardProfile = createinvalidationtracker;
        this.AlternateContactlessPaymentDataJson = clearalltables;
        this.SdkCoreAlternateContactlessPaymentDataImpl = null;
        this.IccPrivateKeyCrtComponentsJson = transactioncanberesumed;
        this.RecordsJson = setciacdeclineonppms;
        this.getAid = getrequiredautomigrationspecs;
        getCiacDecline = (i2 + 9) % 128;
    }

    @Override // com.payair.hce.getContactlessSupported
    public final void DigitizedCardProfile(com.payair.hce.access300 access300Var) throws com.payair.hce.getCurrentRequestId {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.DigitizedCardProfile.writeReplace());
            arrayList.add(this.AlternateContactlessPaymentDataJson.values());
            if (this.getProfileVersion) {
                arrayList.add(new com.payair.hce.getWalletIdentificationDataProvider(valueOf, this.SdkCoreAlternateContactlessPaymentDataImpl));
            } else {
                arrayList.add(new com.payair.hce.getWalletIdentificationDataProvider(values, this.IccPrivateKeyCrtComponentsJson));
                int i = getGpoResponse + 63;
                getCiacDecline = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 / 3;
                }
            }
            com.payair.hce.setCiacDeclineOnPpms setciacdeclineonppms = this.RecordsJson;
            arrayList.add((com.payair.hce.getWalletIdentificationDataProvider) com.payair.hce.setCiacDeclineOnPpms.DigitizedCardProfile(new java.lang.Object[]{setciacdeclineonppms}, -493169071, 493169072, java.lang.System.identityHashCode(setciacdeclineonppms)));
            com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs = this.getAid;
            if (getrequiredautomigrationspecs != null) {
                getGpoResponse = (getCiacDecline + 47) % 128;
                arrayList.add(getrequiredautomigrationspecs.SdkCoreAlternateContactlessPaymentDataImpl());
            }
            super.valueOf(new com.payair.hce.getWalletIdentificationDataProvider(writeReplace, arrayList));
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setMaximumPinTry.valueOf();
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.payair.hce.setMaximumPinTry.valueOf();
        java.lang.String str6 = "";
        android.text.TextUtils.getTrimmedLength("");
        android.graphics.Color.green(0);
        new java.lang.Object[]{getClass().getSimpleName()};
        android.widget.ExpandableListView.getPackedPositionType(0L);
        android.view.View.MeasureSpec.getSize(0);
        com.payair.hce.createInvalidationTracker createinvalidationtracker = this.DigitizedCardProfile;
        if (createinvalidationtracker == null) {
            str = "";
        } else {
            str = com.payair.hce.onRequestSessionCompleted.valueOf((com.payair.hce.transactionCanBeResumed) com.payair.hce.createInvalidationTracker.valueOf(new java.lang.Object[]{createinvalidationtracker}, -2050425528, 2050425528, java.lang.System.identityHashCode(createinvalidationtracker)));
            getCiacDecline = (getGpoResponse + 103) % 128;
        }
        new java.lang.Object[]{str};
        android.text.TextUtils.getOffsetAfter("", 0);
        android.view.ViewConfiguration.getTapTimeout();
        com.payair.hce.clearAllTables clearalltables = this.AlternateContactlessPaymentDataJson;
        if (clearalltables == null) {
            str2 = "";
        } else {
            str2 = clearalltables.valueOf().writeReplace();
        }
        new java.lang.Object[]{str2};
        android.os.SystemClock.elapsedRealtimeNanos();
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.SdkCoreAlternateContactlessPaymentDataImpl;
        if (transactioncanberesumed == null) {
            str3 = "";
        } else {
            str3 = transactioncanberesumed.writeReplace();
        }
        new java.lang.Object[]{str3};
        android.view.ViewConfiguration.getWindowTouchSlop();
        android.os.Process.myTid();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = this.IccPrivateKeyCrtComponentsJson;
        if (transactioncanberesumed2 == null) {
            str4 = "";
        } else {
            getCiacDecline = (getGpoResponse + 83) % 128;
            str4 = transactioncanberesumed2.writeReplace();
        }
        new java.lang.Object[]{str4};
        try {
            android.view.KeyEvent.getMaxKeyCode();
            android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            com.payair.hce.setCiacDeclineOnPpms setciacdeclineonppms = this.RecordsJson;
            if (setciacdeclineonppms == null) {
                str5 = "";
            } else {
                str5 = ((com.payair.hce.transactionCanBeResumed) com.payair.hce.setCiacDeclineOnPpms.DigitizedCardProfile(new java.lang.Object[]{setciacdeclineonppms}, -1794069927, 1794069927, java.lang.System.identityHashCode(setciacdeclineonppms))).writeReplace();
            }
            new java.lang.Object[]{str5};
            com.payair.hce.getRequiredAutoMigrationSpecs getrequiredautomigrationspecs = this.getAid;
            if (getrequiredautomigrationspecs != null) {
                str6 = com.payair.hce.onRequestSessionCompleted.valueOf(getrequiredautomigrationspecs.writeReplace());
            }
            new java.lang.Object[]{str6};
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
        }
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.graphics.Color.argb(0, 0, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(" \u0016\b\u0017\b\u000e \u0013\u001a\u0018\u0002\u0015\u0019\n\n\u0006\u001a\u0016\u001f\r\u0005\u0013", 22 - android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (89 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
        return ((java.lang.String) objArr[0]).intern();
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 57) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = getCvrMaskAnd;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            $10 = ($11 + 15) % 128;
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.view.View.getDefaultSize(0, 0) + 2508, (char) (android.graphics.Color.alpha(0) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b((short) -1, 0, (byte) 1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr4[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getPaymentFci)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2508 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6801));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b((short) -1, 0, (byte) 1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                $11 = ($10 + 121) % 128;
                digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    $11 = ($10 + 23) % 128;
                    cArr5[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr5[digitizedCardJson12.values + 1] = (char) (digitizedCardJson12.writeReplace - b);
                } else {
                    java.lang.Object[] objArr6 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3548, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 48, 2665 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.MotionEvent.axisFromString("") + 18890));
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b((short) -1, 0, (byte) 0, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i4 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i5 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[intValue];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i4 * charValue) + i5];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i6 = digitizedCardJson12.DigitizedCardProfile;
                        int i7 = digitizedCardJson12.RecordsJson;
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr5[digitizedCardJson12.values] = cArr3[(i6 * charValue) + i7];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i8 * charValue) + i9];
                    } else {
                        int i10 = digitizedCardJson12.DigitizedCardProfile;
                        int i11 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i13 = digitizedCardJson12.RecordsJson;
                        cArr5[digitizedCardJson12.values] = cArr3[(i10 * charValue) + i11];
                        cArr5[digitizedCardJson12.values + 1] = cArr3[(i12 * charValue) + i13];
                    }
                }
                digitizedCardJson12.values += 2;
                j = 0;
            }
        }
        int i14 = 0;
        while (i14 < i) {
            int i15 = $11 + 105;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr5[i14] = (char) (cArr5[i14] ^ 26791);
                i14 += 97;
            } else {
                cArr5[i14] = (char) (cArr5[i14] ^ 13722);
                i14++;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void AlternateContactlessPaymentDataJson() {
        SdkCoreBusinessLogicModuleImpl = new char[]{16879, 16796, 16809, 16800, 16800, 16831, 16772, 16774, 16806, 16807, 16828, 16802, 16780, 16884, 16798, 16799, 16885, 16889, 16790, 16808, 16809, 16810, 16805, 16772, 16773, 16801, 16806, 16804, 16806, 16780, 16783, 16805, 16801, 16804, 16806, 16808, 16805, 16804, 16781, 16893, 16792, 16807, 16793, 16780, 16895, 16887, 16789, 16802, 16831, 16801, 16800, 16830, 16802, 16816, 16675, 16672, 16590, 16692, 16699, 16694, 16684, 16654, 16661};
        getCvrMaskAnd = new char[]{1492, 12334, 12344, 12312, 12302, 1491, 12323, 12346, 12331, 12325, 12311, 12324, 12305, 12333, 1489, 1490, 12291, 12313, 12399, 12332, 12335, 1493, 12339, 12351, 12400, 12299, 12329, 12318, 12345, 12297, 12327, 12350, 12407, 1494, 12301, 12326};
        getPaymentFci = (char) 1494;
    }

    static void init$0() {
        $$a = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$b = 72;
    }
}
