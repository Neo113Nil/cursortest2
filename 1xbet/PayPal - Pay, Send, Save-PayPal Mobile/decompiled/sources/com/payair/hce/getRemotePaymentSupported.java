package com.payair.hce;

/* loaded from: classes4.dex */
public final class getRemotePaymentSupported extends com.payair.hce.getContactlessSupported {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int getAid;
    private static int getProfileVersion;
    private static final com.payair.hce.transactionCanBeResumed valueOf;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> AlternateContactlessPaymentDataJson;
    private java.util.HashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> RecordsJson;
    private java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = b2 * 4;
        int i5 = 3 - (i * 2);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i3 = 0;
            int i8 = i5 + (-i7);
            i5 = i6;
            i2 = i8;
            int i9 = i5 + 1;
            bArr2[i3] = (byte) i2;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i9];
            i5 = i2;
            i6 = i9;
            int i82 = i5 + (-i7);
            i5 = i6;
            i2 = i82;
            int i92 = i5 + 1;
            bArr2[i3] = (byte) i2;
            if (i3 == i4) {
            }
        } else {
            i2 = (b * 2) + 115;
            i3 = 0;
            int i922 = i5 + 1;
            bArr2[i3] = (byte) i2;
            if (i3 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        valueOf();
        writeReplace = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(new byte[]{-97, 105});
        DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -116);
        int i = IccPrivateKeyCrtComponentsJson + 93;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final void valueOf(java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list, java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2) {
        int i = IccPrivateKeyCrtComponentsJson + 25;
        getAid = i % 128;
        if (i % 2 == 0) {
            this.RecordsJson = linkedHashMap;
            this.values = list2;
            this.AlternateContactlessPaymentDataJson = list;
        } else {
            this.RecordsJson = linkedHashMap;
            this.values = list2;
            this.AlternateContactlessPaymentDataJson = list;
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.getContactlessSupported
    public final void DigitizedCardProfile(com.payair.hce.access300 access300Var) throws com.payair.hce.getAtcCount {
        IccPrivateKeyCrtComponentsJson = (getAid + 81) % 128;
        try {
            java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = this.values;
            if (list != null) {
                com.payair.hce.transactionCanBeResumed writeReplace2 = com.payair.hce.onRequestSessionCompleted.writeReplace(list);
                java.util.HashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> hashMap = this.RecordsJson;
                com.payair.hce.transactionCanBeResumed transactioncanberesumed = DigitizedCardProfile;
                hashMap.put(transactioncanberesumed, new com.payair.hce.getWalletIdentificationDataProvider(transactioncanberesumed, writeReplace2));
                int i = IccPrivateKeyCrtComponentsJson + 53;
                getAid = i % 128;
                if (i % 2 != 0) {
                    int i2 = 3 / 2;
                }
            }
            java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2 = this.AlternateContactlessPaymentDataJson;
            if (list2 != null) {
                com.payair.hce.transactionCanBeResumed writeReplace3 = com.payair.hce.onRequestSessionCompleted.writeReplace(list2);
                java.util.HashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> hashMap2 = this.RecordsJson;
                com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = valueOf;
                hashMap2.put(transactioncanberesumed2, new com.payair.hce.getWalletIdentificationDataProvider(transactioncanberesumed2, writeReplace3));
            }
            valueOf(new com.payair.hce.getWalletIdentificationDataProvider(writeReplace, this.RecordsJson.values()));
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.view.ViewConfiguration.getJumpTapTimeout();
            android.view.KeyEvent.getModifierMetaStateMask();
            android.view.ViewConfiguration.getLongPressTimeout();
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String intern;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.view.KeyEvent.getModifierMetaStateMask();
        java.lang.String str3 = "";
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.os.Process.getElapsedCpuTime();
        new java.lang.Object[]{getClass().getSimpleName()};
        android.text.TextUtils.getCapsMode("", 0, 0);
        android.view.KeyEvent.getModifierMetaStateMask();
        android.view.ViewConfiguration.getPressedStateDuration();
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list = this.AlternateContactlessPaymentDataJson;
        if (list != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(false, "\u0000", 200 - android.view.View.resolveSizeAndState(0, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
            str = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list, ((java.lang.String) objArr[0]).intern());
            IccPrivateKeyCrtComponentsJson = (getAid + 27) % 128;
        } else {
            str = "";
        }
        new java.lang.Object[]{str};
        android.view.KeyEvent.getMaxKeyCode();
        android.view.KeyEvent.normalizeMetaState(0);
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> list2 = this.values;
        if (list2 != null) {
            int i = getAid + 99;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 == 0) {
                int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(false, "\u0000", 20021 >> (scrollDefaultDelay % 25), minimumFlingVelocity + 8, -android.widget.ExpandableListView.getPackedPositionChild(1L), objArr2);
                intern = ((java.lang.String) objArr2[0]).intern();
            } else {
                int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay();
                int minimumFlingVelocity2 = android.view.ViewConfiguration.getMinimumFlingVelocity();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(false, "\u0000", (scrollDefaultDelay2 >> 16) + 200, 1 - (minimumFlingVelocity2 >> 16), -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr3);
                intern = ((java.lang.String) objArr3[0]).intern();
            }
            str2 = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(list2, intern);
        } else {
            str2 = "";
        }
        new java.lang.Object[]{str2};
        android.text.TextUtils.indexOf("", "", 0);
        android.view.ViewConfiguration.getJumpTapTimeout();
        android.view.ViewConfiguration.getMinimumFlingVelocity();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.HashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> hashMap = this.RecordsJson;
        if (hashMap != null) {
            java.util.Collection<com.payair.hce.getWalletIdentificationDataProvider> values = hashMap.values();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(false, "\u0000", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 200, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, android.view.KeyEvent.normalizeMetaState(0) + 1, objArr4);
            str3 = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(values, ((java.lang.String) objArr4[0]).intern());
        }
        sb.append(str3);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a(false, "\u0000", 249 - (android.os.Process.myTid() >> 22), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 1, objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        new java.lang.Object[]{sb.toString()};
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        a(true, "\n\u000b\u000e\u0000￭\uffff\r\n\ufffe\u0000￭\uffff￼\u0000￭\u0010\uffff\u000bￜ\u0000\u000e\t", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 257, android.view.View.MeasureSpec.getMode(0) + 15, 22 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr6);
        return ((java.lang.String) objArr6[0]).intern();
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = $11 + 105;
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            int i6 = i5 + 115;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 99) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i7 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i7]), java.lang.Integer.valueOf(getProfileVersion)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2074 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (60036 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 3543 - android.view.View.combineMeasuredStates(0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
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
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $11 = ($10 + 83) % 128;
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.graphics.ImageFormat.getBitsPerPixel(0), 3543 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            $10 = ($11 + 107) % 128;
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{16, 76, 17, 34};
        $$b = 63;
    }

    static void valueOf() {
        getProfileVersion = 1889207293;
    }
}
