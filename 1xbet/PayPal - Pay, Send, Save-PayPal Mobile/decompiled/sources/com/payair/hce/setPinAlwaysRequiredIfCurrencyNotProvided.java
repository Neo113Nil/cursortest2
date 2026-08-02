package com.payair.hce;

/* loaded from: classes4.dex */
public final class setPinAlwaysRequiredIfCurrencyNotProvided extends com.payair.hce.getContactlessSupported {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private static boolean IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getPaymentFci;
    private static boolean getProfileVersion;
    private static final com.payair.hce.transactionCanBeResumed valueOf;
    public static final com.payair.hce.transactionCanBeResumed values;
    private com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private com.payair.hce.transactionCanBeResumed writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = (s * 4) + 4;
        int i3 = b * 3;
        byte[] bArr = $$a;
        int i4 = 118 - (s2 * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i4 = (-i4) + i5;
            i2++;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i5 = i4;
            i4 = bArr[i2];
            i6 = i7;
            i4 = (-i4) + i5;
            i2++;
            i = i6;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i3) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getPaymentFci = 1;
        valueOf();
        DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.visa.cbp.getEncExpo.IResultReceiver);
        values = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -126);
        valueOf = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -108);
        int i = getPaymentFci + 37;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2) {
        int i = RecordsJson + 69;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            this.writeReplace = transactioncanberesumed;
            this.AlternateContactlessPaymentDataJson = transactioncanberesumed2;
        } else {
            this.writeReplace = transactioncanberesumed;
            this.AlternateContactlessPaymentDataJson = transactioncanberesumed2;
            throw null;
        }
    }

    @Override // com.payair.hce.getContactlessSupported
    public final void DigitizedCardProfile(com.payair.hce.access300 access300Var) throws com.payair.hce.getAtcCount {
        try {
            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(values, this.writeReplace);
            com.payair.hce.access300.values(new java.lang.Object[]{access300Var, getwalletidentificationdataprovider}, 1165064256, -1165064256, java.lang.System.identityHashCode(access300Var));
            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 = new com.payair.hce.getWalletIdentificationDataProvider(valueOf, this.AlternateContactlessPaymentDataJson);
            com.payair.hce.access300.values(new java.lang.Object[]{access300Var, getwalletidentificationdataprovider2}, 1165064256, -1165064256, java.lang.System.identityHashCode(access300Var));
            super.valueOf(new com.payair.hce.getWalletIdentificationDataProvider(DigitizedCardProfile, new com.payair.hce.getWalletIdentificationDataProvider[]{getwalletidentificationdataprovider, getwalletidentificationdataprovider2}));
            RecordsJson = (getPaymentFci + 99) % 128;
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str;
        getPaymentFci = (RecordsJson + 11) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.graphics.Color.alpha(0);
        new java.lang.Object[]{getClass().getSimpleName()};
        android.graphics.PointF.length(0.0f, 0.0f);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.writeReplace;
        if (transactioncanberesumed != null) {
            int i = getPaymentFci + 59;
            RecordsJson = i % 128;
            if (i % 2 != 0) {
                transactioncanberesumed.writeReplace();
                throw null;
            }
            str = transactioncanberesumed.writeReplace();
        } else {
            getPaymentFci = (RecordsJson + 81) % 128;
            str = "";
        }
        new java.lang.Object[]{str};
        android.view.ViewConfiguration.getScrollFriction();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = this.AlternateContactlessPaymentDataJson;
        sb.append(transactioncanberesumed2 != null ? transactioncanberesumed2.writeReplace() : "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 127, null, null, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        new java.lang.Object[]{sb.toString()};
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u0096\u0097\u0087 \u008a\u0089\u0083\u0084\u0087\u0089\u008a\u009b\u0089\u0083\u0084\u0094\u0085\u0087\u008e\u0098\u0083\u0094\u0089\u0089\u008a\u0091\u0084\u0088\u009a\u0085\u008a\u0099", objArr2);
        return ((java.lang.String) objArr2[0]).intern();
    }

    private static void a(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        char[] cArr;
        java.lang.String str3 = str2;
        int i2 = $11;
        $10 = (i2 + 89) % 128;
        byte[] bArr = str3;
        if (str3 != null) {
            $10 = (i2 + 103) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr2 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i3 = 2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 13;
                $11 = i5 % 128;
                if (i5 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4])};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        i4--;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr2[i4])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46, 286 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i3 = 2;
            }
            cArr2 = cArr3;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 46, 287 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (46336 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (IccPrivateKeyCrtComponentsJson) {
            int i6 = $11 + 33;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                getumdgeneration.values = bArr2.length;
                cArr = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 1;
            } else {
                getumdgeneration.values = bArr2.length;
                cArr = new char[getumdgeneration.values];
                getumdgeneration.valueOf = 0;
            }
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                int i7 = $10 + 17;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = getumdgeneration.valueOf;
                    int i9 = getumdgeneration.values;
                    int i10 = getumdgeneration.valueOf;
                    cArr[i8] = (char) (cArr2[bArr2[0] >>> i] % intValue);
                    java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj4 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 1628 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr6);
                        obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                } else {
                    cArr[getumdgeneration.valueOf] = (char) (cArr2[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                    java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                    if (obj5 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 43, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1629, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b((short) 0, (short) 0, (byte) 0, objArr8);
                        obj5 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
                    }
                    ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
                }
            }
            objArr[0] = new java.lang.String(cArr);
            return;
        }
        if (!getProfileVersion) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr2[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            int i11 = $10 + 45;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr5[getumdgeneration.valueOf] = (char) (cArr2[charArray[getumdgeneration.values << getumdgeneration.valueOf] / i] + intValue);
                java.lang.Object[] objArr9 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj6 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.KeyEvent.getDeadChar(0, 0), android.view.View.MeasureSpec.getSize(0) + 1629, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b((short) 0, (short) 0, (byte) 0, objArr10);
                    obj6 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            } else {
                cArr5[getumdgeneration.valueOf] = (char) (cArr2[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                java.lang.Object[] objArr11 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj7 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 43, 1629 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b((short) 0, (short) 0, (byte) 0, objArr12);
                    obj7 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr11);
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{75, -78, -116, -102};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
    }

    static void valueOf() {
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{10982, 10948, 10963, 10962, 10921, 10757, 10965, 10967, 10966, 10968, 10953, 10993, 10955, 10994, 10951, 10975, 10950, 10922, 10973, 10972, 10961, 10920, 10969, 10970, 11002, 10997, 10999, 10776, 10991, 10958, 10960, 10980, 10976, 10971, 10944};
        getAid = -143185371;
        getProfileVersion = true;
        IccPrivateKeyCrtComponentsJson = true;
    }
}
