package com.payair.hce;

/* loaded from: classes4.dex */
public final class setRemotePaymentSupported extends com.payair.hce.getContactlessSupported {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getProfileVersion;
    private static final com.payair.hce.transactionCanBeResumed values;
    private static final com.payair.hce.transactionCanBeResumed writeReplace;
    private java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> AlternateContactlessPaymentDataJson;
    private com.payair.hce.transactionCanBeResumed RecordsJson;
    private com.payair.hce.transactionCanBeResumed valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = b2 + 4;
        int i4 = i * 4;
        int i5 = 119 - (b * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i5 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i5 += -i6;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getProfileVersion = 1;
        writeReplace();
        DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) 111);
        values = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -124);
        writeReplace = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile((byte) -91);
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 95) % 128;
        if (str != null) {
            int i3 = i2 + 93;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
            $11 = ($10 + 97) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(SdkCoreAlternateContactlessPaymentDataImpl ^ (-3824242241614154557L), cArr, i);
        int i4 = 4;
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - i4;
            int i5 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % i4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40, 1921 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1));
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (-b);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, (byte) (b2 + 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26, android.text.TextUtils.getOffsetBefore("", 0) + 429, (char) (31610 - android.widget.ExpandableListView.getPackedPositionGroup(0L)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b((byte) 0, (byte) -1, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                i4 = 4;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    public final void DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 73) % 128;
        this.RecordsJson = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(transactioncanberesumed);
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 1) % 128;
    }

    public final void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed, java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap) {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 87;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            this.valueOf = transactioncanberesumed;
            this.AlternateContactlessPaymentDataJson = linkedHashMap;
            getProfileVersion = (i + 57) % 128;
        } else {
            this.valueOf = transactioncanberesumed;
            this.AlternateContactlessPaymentDataJson = linkedHashMap;
            throw null;
        }
    }

    @Override // com.payair.hce.getContactlessSupported
    public final void DigitizedCardProfile(com.payair.hce.access300 access300Var) throws com.payair.hce.getAtcCount {
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.RecordsJson;
        if (transactioncanberesumed != null) {
            try {
                super.AlternateContactlessPaymentDataJson(transactioncanberesumed);
                return;
            } catch (com.payair.hce.setRegistrationResponseData unused) {
                com.payair.hce.setMaximumPinTry.valueOf();
                android.graphics.Color.red(0);
                return;
            }
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.valueOf != null) {
                com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider = new com.payair.hce.getWalletIdentificationDataProvider(values, this.valueOf);
                com.payair.hce.access300.values(new java.lang.Object[]{access300Var, getwalletidentificationdataprovider}, 1165064256, -1165064256, java.lang.System.identityHashCode(access300Var));
                arrayList.add(getwalletidentificationdataprovider);
            }
            com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider2 = new com.payair.hce.getWalletIdentificationDataProvider(writeReplace, this.AlternateContactlessPaymentDataJson.values());
            java.util.Iterator<com.payair.hce.getWalletIdentificationDataProvider> it = this.AlternateContactlessPaymentDataJson.values().iterator();
            while (it.hasNext()) {
                int i = IccPrivateKeyCrtComponentsJson + 95;
                getProfileVersion = i % 128;
                if (i % 2 == 0) {
                    com.payair.hce.access300.values(new java.lang.Object[]{access300Var, it.next()}, 1165064256, -1165064256, java.lang.System.identityHashCode(access300Var));
                    throw new java.lang.NullPointerException();
                }
                com.payair.hce.access300.values(new java.lang.Object[]{access300Var, it.next()}, 1165064256, -1165064256, java.lang.System.identityHashCode(access300Var));
            }
            arrayList.add(getwalletidentificationdataprovider2);
            super.valueOf(new com.payair.hce.getWalletIdentificationDataProvider(DigitizedCardProfile, arrayList));
            int i2 = getProfileVersion + 71;
            IccPrivateKeyCrtComponentsJson = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (com.payair.hce.createDemoTransactionCredentials | com.payair.hce.generateExpiryDate | com.payair.hce.postToastMessageOnUi unused2) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            throw new com.payair.hce.getCurrentRequestId(com.payair.hce.requestTaskStatusUpdate.SdkCoreRecordsImpl);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object[] objArr;
        char c;
        java.lang.String str;
        int i = IccPrivateKeyCrtComponentsJson + 77;
        getProfileVersion = i % 128;
        java.lang.String str2 = "";
        if (i % 2 == 0) {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.graphics.Color.red(0);
            new java.lang.Object[0][0] = getClass().getSimpleName();
            android.graphics.Color.argb(0, 0, 0, 0);
            objArr = new java.lang.Object[1];
            if (this.RecordsJson != null) {
                c = 1;
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 75) % 128;
                str = this.RecordsJson.writeReplace();
            } else {
                c = 1;
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 75) % 128;
                str = "";
            }
        } else {
            com.payair.hce.setMaximumPinTry.valueOf();
            android.graphics.Color.red(0);
            new java.lang.Object[]{getClass().getSimpleName()};
            android.graphics.Color.argb(0, 0, 0, 0);
            objArr = new java.lang.Object[1];
            if (this.RecordsJson != null) {
                c = 0;
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 75) % 128;
                str = this.RecordsJson.writeReplace();
            } else {
                c = 0;
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 75) % 128;
                str = "";
            }
        }
        objArr[c] = str;
        android.graphics.Color.blue(0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.valueOf;
        new java.lang.Object[]{transactioncanberesumed != null ? transactioncanberesumed.writeReplace() : ""};
        android.widget.ExpandableListView.getPackedPositionGroup(0L);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getWalletIdentificationDataProvider> linkedHashMap = this.AlternateContactlessPaymentDataJson;
        if (linkedHashMap != null) {
            java.util.Collection<com.payair.hce.getWalletIdentificationDataProvider> values2 = linkedHashMap.values();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("獫鉤㴚獇蜥", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr2);
            str2 = com.payair.hce.onDeviceNotSecure.DigitizedCardProfile(values2, ((java.lang.String) objArr2[0]).intern());
        }
        sb.append(str2);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a("\udaa0\ue9fd\uf343\udafd䞵", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        new java.lang.Object[]{sb.toString()};
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        a("묥噑竂뭶㭠鷃\ued40壠钚귶뵚꣄\ue4ee綎贋\uf893㓂\u0dbf崁졩б\udd43", 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        return ((java.lang.String) objArr4[0]).intern();
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ETB, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 16, 123};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
    }

    static void writeReplace() {
        SdkCoreAlternateContactlessPaymentDataImpl = 4040230285462257460L;
    }
}
