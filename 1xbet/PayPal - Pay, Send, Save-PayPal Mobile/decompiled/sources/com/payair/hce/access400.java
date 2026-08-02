package com.payair.hce;

/* loaded from: classes4.dex */
public final class access400 {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int valueOf;
    private static long values;
    private java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.getReasonCode> AlternateContactlessPaymentDataJson = new java.util.LinkedHashMap<>();
    private java.util.LinkedHashMap<com.payair.hce.transactionCanBeResumed, com.payair.hce.transactionCanBeResumed> writeReplace = new java.util.LinkedHashMap<>();
    private com.payair.hce.setPinIvCvc3Track2 DigitizedCardProfile = com.payair.hce.setMaximumPinTry.valueOf();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b * 7;
        int i4 = i + 4;
        int i5 = (b2 * 4) + 99;
        byte[] bArr2 = new byte[i3 + 24];
        int i6 = i3 + 23;
        if (bArr == null) {
            int i7 = i5;
            i2 = 0;
            i5 = i6;
            i5 += i7;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i4];
            i5 += i7;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 119 - (b * 2);
        int i4 = (b2 * 4) + 4;
        byte[] bArr = $$d;
        int i5 = (s * 2) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 += -i6;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i3 += -i6;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        int i8 = (i * (-496)) + (i2 * (-496)) + ((~i6) * 497) + (((~(i6 | i3)) | (~(i5 | i7 | i))) * 497) + (((~(i | i5 | i3)) | (~(i2 | i4)) | (~(i4 | i7))) * 497);
        return i8 != 1 ? i8 != 2 ? writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr);
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            int i2 = $10 + 69;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr = str.toCharArray();
            $11 = ($10 + 87) % 128;
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(values ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1921, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    byte b = (byte) (-$$d[1]);
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 428 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 31610));
                    byte b3 = (byte) ($$d[1] + 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(b3, b3, b3, objArr5);
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
        java.lang.String str2 = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
        $10 = ($11 + 63) % 128;
        objArr[0] = str2;
    }

    public final void DigitizedCardProfile(com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider) throws com.payair.hce.postToastMessageOnUi {
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 115) % 128;
        if (!this.AlternateContactlessPaymentDataJson.containsKey(getwalletidentificationdataprovider.valueOf())) {
            com.payair.hce.setMobilePin DigitizedCardProfile = com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile(getwalletidentificationdataprovider.valueOf());
            if (DigitizedCardProfile == null) {
                this.writeReplace.put(getwalletidentificationdataprovider.valueOf(), getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson());
                android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getwalletidentificationdataprovider.valueOf().writeReplace());
                java.lang.Object[] objArr = new java.lang.Object[1];
                a("⑹␅鐂氟ꙥ", 1 - android.text.TextUtils.getCapsMode("", 0, 0), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(getwalletidentificationdataprovider.RecordsJson().writeReplace());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a("⑹␅鐂氟ꙥ", 1 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                sb.append(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson().writeReplace());
                new java.lang.Object[]{sb.toString()};
            } else {
                int i = SdkCoreAlternateContactlessPaymentDataImpl + 29;
                valueOf = i % 128;
                if (i % 2 != 0) {
                    this.AlternateContactlessPaymentDataJson.put(getwalletidentificationdataprovider.valueOf(), DigitizedCardProfile.valueOf());
                    throw null;
                }
                this.AlternateContactlessPaymentDataJson.put(getwalletidentificationdataprovider.valueOf(), DigitizedCardProfile.valueOf());
            }
        }
        if (this.AlternateContactlessPaymentDataJson.containsKey(getwalletidentificationdataprovider.valueOf())) {
            com.payair.hce.getReasonCode getreasoncode = this.AlternateContactlessPaymentDataJson.get(getwalletidentificationdataprovider.valueOf());
            android.widget.ExpandableListView.getPackedPositionType(0L);
            java.lang.String simpleName = getreasoncode.getClass().getSimpleName();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(getwalletidentificationdataprovider.valueOf().writeReplace());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("⑹␅鐂氟ꙥ", 1 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            sb2.append(getwalletidentificationdataprovider.RecordsJson().writeReplace());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("⑹␅鐂氟ꙥ", 1 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
            sb2.append(((java.lang.String) objArr4[0]).intern());
            sb2.append(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson().writeReplace());
            new java.lang.Object[]{simpleName, sb2.toString()};
            getreasoncode.valueOf(getwalletidentificationdataprovider.AlternateContactlessPaymentDataJson());
            valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
        }
    }

    private <T extends com.payair.hce.getReasonCode> T values(java.lang.Class<T> cls) throws com.payair.hce.getSetPinRequestData {
        com.payair.hce.transactionCanBeResumed valueOf2 = com.payair.hce.createTransactionCredentialForLocalStorage.valueOf((java.lang.Class<?>) cls);
        if (!this.AlternateContactlessPaymentDataJson.containsKey(valueOf2)) {
            android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            new java.lang.Object[]{cls.getSimpleName(), valueOf2};
            throw new com.payair.hce.getSetPinRequestData();
        }
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 69) % 128;
        T t = (T) this.AlternateContactlessPaymentDataJson.get(valueOf2);
        int i = valueOf + 23;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return t;
        }
        throw new java.lang.ArithmeticException();
    }

    public final <T extends com.payair.hce.getReasonCode> T valueOf(java.lang.Class<T> cls) {
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 95) % 128;
        com.payair.hce.transactionCanBeResumed valueOf2 = com.payair.hce.createTransactionCredentialForLocalStorage.valueOf((java.lang.Class<?>) cls);
        if (!this.AlternateContactlessPaymentDataJson.containsKey(valueOf2)) {
            android.view.ViewConfiguration.getPressedStateDuration();
            new java.lang.Object[]{cls.getSimpleName(), valueOf2};
            return (T) com.payair.hce.createTransactionCredentialForLocalStorage.DigitizedCardProfile(valueOf2).valueOf();
        }
        int i = SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        valueOf = i % 128;
        if (i % 2 != 0) {
            this.AlternateContactlessPaymentDataJson.get(valueOf2);
            throw null;
        }
        T t = (T) this.AlternateContactlessPaymentDataJson.get(valueOf2);
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 15) % 128;
        return t;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) objArr[0];
        int i = valueOf + 117;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        com.payair.hce.provisionFromLocalStorage provisionfromlocalstorage = (com.payair.hce.provisionFromLocalStorage) access400Var.values(com.payair.hce.provisionFromLocalStorage.class);
        if (i % 2 != 0) {
            return provisionfromlocalstorage;
        }
        throw null;
    }

    public final com.payair.hce.readContactlessImk valueOf() throws com.payair.hce.getSetPinRequestData {
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 83) % 128;
        com.payair.hce.readContactlessImk readcontactlessimk = (com.payair.hce.readContactlessImk) values(com.payair.hce.readContactlessImk.class);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 47;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return readcontactlessimk;
        }
        throw null;
    }

    public final com.payair.hce.readJsonFromLocalStorage DigitizedCardProfile() throws com.payair.hce.getSetPinRequestData {
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 97) % 128;
        com.payair.hce.readJsonFromLocalStorage readjsonfromlocalstorage = (com.payair.hce.readJsonFromLocalStorage) values(com.payair.hce.readJsonFromLocalStorage.class);
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 43) % 128;
        return readjsonfromlocalstorage;
    }

    public final com.payair.hce.getDigitizedCardProfile values() throws com.payair.hce.getSetPinRequestData {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 15;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.getDigitizedCardProfile getdigitizedcardprofile = (com.payair.hce.getDigitizedCardProfile) values(com.payair.hce.getDigitizedCardProfile.class);
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 105) % 128;
        return getdigitizedcardprofile;
    }

    public final com.payair.hce.readValue writeReplace() throws com.payair.hce.getSetPinRequestData {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 25;
        valueOf = i % 128;
        if (i % 2 != 0) {
            byte b = (byte) ($$a[5] + 1);
            byte b2 = (byte) (b + 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b, b2, b2, objArr);
            throw null;
        }
        byte b3 = (byte) ($$a[5] + 1);
        byte b4 = (byte) (b3 + 1);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b(b3, b4, b4, objArr2);
        com.payair.hce.readValue readvalue = (com.payair.hce.readValue) values(java.lang.Class.forName((java.lang.String) objArr2[0]));
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 87) % 128;
        return readvalue;
    }

    public final com.payair.hce.createOpenHelper getProfileVersion() throws com.payair.hce.getSetPinRequestData {
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 73) % 128;
        byte b = (byte) (-$$a[47]);
        byte b2 = (byte) ($$b & 3);
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(b, b2, (byte) (b2 - 1), objArr);
        com.payair.hce.createOpenHelper createopenhelper = (com.payair.hce.createOpenHelper) values(java.lang.Class.forName((java.lang.String) objArr[0]));
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 67) % 128;
        return createopenhelper;
    }

    public final com.payair.hce.readDsrpImk RecordsJson() throws com.payair.hce.getSetPinRequestData {
        int i = valueOf + 41;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        com.payair.hce.readDsrpImk readdsrpimk = (com.payair.hce.readDsrpImk) values(com.payair.hce.readDsrpImk.class);
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 111;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return readdsrpimk;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.deviceAuthenticationCompleted IccPrivateKeyCrtComponentsJson() throws com.payair.hce.getSetPinRequestData {
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 77) % 128;
        com.payair.hce.deviceAuthenticationCompleted deviceauthenticationcompleted = (com.payair.hce.deviceAuthenticationCompleted) values(com.payair.hce.deviceAuthenticationCompleted.class);
        int i = valueOf + 105;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return deviceauthenticationcompleted;
        }
        throw null;
    }

    public final com.payair.hce.getAllCmsCFormattedTransactionCredentials getAid() throws com.payair.hce.getSetPinRequestData {
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 49) % 128;
        com.payair.hce.getAllCmsCFormattedTransactionCredentials getallcmscformattedtransactioncredentials = (com.payair.hce.getAllCmsCFormattedTransactionCredentials) values(com.payair.hce.getAllCmsCFormattedTransactionCredentials.class);
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 29) % 128;
        return getallcmscformattedtransactioncredentials;
    }

    public final com.payair.hce.getCmsCFormattedDigitizedCardProfile SdkCoreAlternateContactlessPaymentDataImpl() throws com.payair.hce.getSetPinRequestData {
        SdkCoreAlternateContactlessPaymentDataImpl = (valueOf + 17) % 128;
        com.payair.hce.getCmsCFormattedDigitizedCardProfile getcmscformatteddigitizedcardprofile = (com.payair.hce.getCmsCFormattedDigitizedCardProfile) values(com.payair.hce.getCmsCFormattedDigitizedCardProfile.class);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 47;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return getcmscformatteddigitizedcardprofile;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) objArr[0];
        valueOf = (SdkCoreAlternateContactlessPaymentDataImpl + 39) % 128;
        com.payair.hce.getTransactionCredentialData gettransactioncredentialdata = (com.payair.hce.getTransactionCredentialData) access400Var.values(com.payair.hce.getTransactionCredentialData.class);
        int i = valueOf + 61;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            return gettransactioncredentialdata;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 65;
        valueOf = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        com.payair.hce.getMobilePin getmobilepin = (com.payair.hce.getMobilePin) access400Var.values(com.payair.hce.getMobilePin.class);
        int i2 = valueOf + 23;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            return getmobilepin;
        }
        throw null;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        values = 899608997232283226L;
    }

    public final com.payair.hce.getMobilePin getPaymentFci() throws com.payair.hce.getSetPinRequestData {
        return (com.payair.hce.getMobilePin) writeReplace(new java.lang.Object[]{this}, 636568534, -636568534, java.lang.System.identityHashCode(this));
    }

    static void init$1() {
        $$d = new byte[]{18, -1, 36, -56};
        $$e = 28;
    }

    public final com.payair.hce.getTransactionCredentialData getGpoResponse() throws com.payair.hce.getSetPinRequestData {
        return (com.payair.hce.getTransactionCredentialData) writeReplace(new java.lang.Object[]{this}, -1080515727, 1080515728, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{107, 13, -60, -69, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 68, -13, -4, 3, -14, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SI, -13, -4, 19, -15, -22, 33, -11, 9, -38, com.google.common.base.Ascii.GS, 7, 4, -11, 13};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE;
    }

    public final com.payair.hce.provisionFromLocalStorage AlternateContactlessPaymentDataJson() throws com.payair.hce.getSetPinRequestData {
        return (com.payair.hce.provisionFromLocalStorage) writeReplace(new java.lang.Object[]{this}, 1737569389, -1737569387, java.lang.System.identityHashCode(this));
    }
}
